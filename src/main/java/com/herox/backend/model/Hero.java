package com.herox.backend.model;

import java.util.LinkedList;
import java.util.Set;

public class Hero {

    private String name;
    private Set<HeroSpec> powers;

    public Hero(String name, Set powers){
        this.name = name;
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean checkPowers(Set<HeroSpec> heroSpecs){

        return powers.containsAll(heroSpecs);
    }

    public void setPowers(Set<HeroSpec> powers) {
        this.powers = powers;
    }


}
