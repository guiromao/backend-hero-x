package com.herox.backend.controller;

import com.herox.backend.model.HeroManager;
import com.herox.backend.model.IntSecurity;
import com.herox.backend.model.missions.Mission;
import com.herox.backend.model.missions.MissionStatus;
import com.herox.backend.services.ManagerService;
import com.herox.backend.services.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class MainController {

    private ManagerService managerServices;
    private MissionService missionService;

    @Autowired
    public void setMissionService(MissionService service){
        missionService = service;
    }

    @Autowired
    public void setManagerServices(ManagerService service){
        managerServices = service;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public ResponseEntity<List<HeroManager>> listManagers(){

        return new ResponseEntity(managerServices.getManagersList(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ResponseEntity<IntSecurity> login(@RequestParam String login,
                                             @RequestParam String password){

        HeroManager manager = managerServices.login(login, password);

        if(manager != null){
            return new ResponseEntity<>(new IntSecurity(manager.getId(), manager.getHashPass()), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(method = RequestMethod.GET, path="/{id}/missions")
    public ResponseEntity<List<Mission>> getMissionsByHero(@PathVariable Integer id){

        List<Mission> missions = missionService.getMissionsByHero(id);

        return new ResponseEntity<>(missions, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<HeroManager> getHeroManager(@PathVariable Integer id,
                                                      @RequestParam String hash){

        if(hash.equals(managerServices.getManager(id).getHashPass())){
            return new ResponseEntity<>(managerServices.getManager(id), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ResponseEntity<HeroManager> getHero(@RequestParam Integer id){

        return new ResponseEntity<>(managerServices.getManager(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path="/")
    public ResponseEntity<HeroManager> addHeroManager(@RequestBody HeroManager manager){
        managerServices.addManager(manager);

        return new ResponseEntity<>(manager, HttpStatus.CREATED);
    }

}



