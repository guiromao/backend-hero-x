package com.herox.backend.model;

import java.util.LinkedList;
import java.util.List;

public class Hero {

    private String name;
    private LinkedList<HeroSpec> powers;

    public Hero(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean checkPowers(List<HeroSpec> heroSpecs){
        boolean checks = true;
/*
        heroSpecs.stream().forEach(spec -> if(powers.contains(spec)) {

        });
*/
        return checks;
    }
}
