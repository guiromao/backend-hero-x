package com.herox.backend.controller;

import com.herox.backend.model.Band;
import com.herox.backend.model.Hero;
import com.herox.backend.model.HeroManager;
import org.springframework.http.HttpRange;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class MainController {

    private List<Band> bands = Arrays.asList(new Band("Red Hot Chilli Peppers", "Rock, Pop", 1983, "USA"),
            new Band("Franz Ferdinand", "Rock / Indie", 2002, "Scotland"),
            new Band("Daft Punk", "Electro / Disco", 1993, "France"));

    private List<HeroManager> managersList = Arrays.asList(
            new HeroManager("Professor", new Hero("Powerpuff Girls"), "professor123",
            "sugarspiceandeverythingnice"),
            new HeroManager("Alfred", new Hero("Batman"), "alfred1",
                    "heybatman"));

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public ResponseEntity<List<HeroManager>> listManagers(){

        return new ResponseEntity(managersList, HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = {"", "/"})
    public ResponseEntity addManager(@RequestBody HeroManager manager){
        managersList.add(manager);

        return new ResponseEntity(/*managersList.get(managersList.size() - 1), */HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{id}/edit/")
    public ResponseEntity updateManager(@RequestBody HeroManager manager, @PathVariable Integer id){
        managersList.set((id - 1), manager);

        return new ResponseEntity(HttpStatus.OK);
    }



}



