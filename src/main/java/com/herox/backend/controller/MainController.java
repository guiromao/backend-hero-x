package com.herox.backend.controller;

import com.herox.backend.model.Hero;
import com.herox.backend.model.HeroManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class MainController {

    private List<HeroManager> managersList = Arrays.asList(
            new HeroManager("Professor", new Hero("Powerpuff Girls"), "professor123",
            "sugarspiceandeverythingnice"),
            new HeroManager("Alfred", new Hero("Batman"), "alfred1",
                    "heybatman"));

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public ResponseEntity<List<HeroManager>> listManagers(){

        return new ResponseEntity(managersList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ResponseEntity<HeroManager> login(@RequestParam String login,
                                             @RequestParam String password){
        HeroManager manager = findManager(login);

        if(manager.getPassword().equals(password)){
            return new ResponseEntity<>(manager, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    private HeroManager findManager(String login){
        for(HeroManager manager: managersList){
            if(login.equals(manager.getLogin())){
                return manager;
            }
        }
        return null;
    }



}



