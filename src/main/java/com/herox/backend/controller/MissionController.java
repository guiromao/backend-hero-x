package com.herox.backend.controller;

import com.herox.backend.dto.MissionDto;
import com.herox.backend.dto.MissionDtoToMission;
import com.herox.backend.model.ObjectsConstructor;
import com.herox.backend.model.missions.Mission;
import com.herox.backend.model.missions.MissionStatus;
import com.herox.backend.services.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value="/api/missions")
public class MissionController {

    @Autowired
    private MissionDtoToMission missionDtoToMission;

    private MissionService missionService;

    @Autowired
    public void setMissionService(MissionService service){
        missionService = service;
    }

    @RequestMapping(method = RequestMethod.GET, value={"/", ""})
    public ResponseEntity<List<Mission>> getMissions(){
        return new
                ResponseEntity<>(missionService.getAvailableMissions(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value="/")
    public ResponseEntity<MissionDto> addMission(@RequestBody MissionDto missionDto){
        Mission mission = missionDtoToMission.convert(missionDto);

        missionService.addMission(mission);

        return new ResponseEntity<>(missionDto, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path="/{hId}/claim/{mId}")
    public ResponseEntity claimMission(@PathVariable Integer hId, @PathVariable Integer mId){

        if(missionService.claimMission(hId, mId)){

            return new ResponseEntity(HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Mission> getMission(@PathVariable Integer id){
        return new ResponseEntity(missionService.getMission(id), HttpStatus.OK);
    }

    /*@RequestMapping(method = RequestMethod.PUT, value="/{mId}")
    public ResponseEntity addMission(@PathVariable Integer mId,
                                                 @RequestBody MissionDto missionDto){
        Mission mission = missionDtoToMission.convert(missionDto);

        missionService.editMission(mId, mission);

        return new ResponseEntity(HttpStatus.OK);
    }*/

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public ResponseEntity editMission(@PathVariable Integer id){
        missionService.editMission(id);

        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public ResponseEntity deleteMission(@PathVariable Integer id){
        missionService.deleteMission(id);

        return new ResponseEntity(HttpStatus.OK);
    }


}
