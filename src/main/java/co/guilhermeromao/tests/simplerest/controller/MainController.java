package co.guilhermeromao.tests.simplerest.controller;

import co.guilhermeromao.tests.simplerest.model.Band;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/bands")
public class MainController {

    private List<Band> bands;

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public ResponseEntity<List<Band>> listBands(){

        bands = Arrays.asList(new Band("Red Hot Chilli Peppers", "Rock, Pop", 1983, "USA"),
                new Band("Franz Ferdinand", "Rock / Indie", 2002, "Scotland"),
                new Band("Daft Punk", "Electro / Disco", 1993, "France"));

        return new ResponseEntity(bands, HttpStatus.OK);
    }



}



