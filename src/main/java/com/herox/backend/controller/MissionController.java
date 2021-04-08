package com.herox.backend.controller;

import com.herox.backend.dto.MissionDto;
import com.herox.backend.dto.MissionDtoToMission;
import com.herox.backend.model.missions.Mission;
import com.herox.backend.model.missions.MissionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/missions")
public class MissionController {

    @Autowired
    private MissionDtoToMission missionDtoToMission;

    private List<String> strings = Arrays.asList("yeah", "viva", "baby");

    private List<Mission> missions = Arrays.asList(
            new Mission("Saving a cat from a really tall tree!", "This job is for a really strong and tall person",
                    9001, 1, "Lisboa", MissionStatus.READY)
    );

    @RequestMapping(method = RequestMethod.GET, value={"/", ""})
    public ResponseEntity<List<Mission>> getMissions(){
        return new ResponseEntity<>(missions, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value="/")
    public ResponseEntity<MissionDto> addMission(@RequestBody MissionDto missionDto){
        Mission mission = missionDtoToMission.convert(missionDto);

        missions.add(mission);

        return new ResponseEntity<>(missionDto, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST, value="/string")
    public ResponseEntity<String> addString(@RequestParam String value){
        strings.add(value);

        return new ResponseEntity<>(value, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value="/string")
    public ResponseEntity<List<String>> getStrings(){
        return new ResponseEntity<>(strings, HttpStatus.OK);
    }

}
