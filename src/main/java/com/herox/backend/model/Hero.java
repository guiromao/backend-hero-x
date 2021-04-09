package com.herox.backend.model;

import java.util.LinkedList;
import java.util.Set;

public class Hero extends Model{

    private String name;
    private Set<HeroSpec> powers;
    private String imgUrl;
    private String powersString;


    public Hero(String name, Set powers){
        this.name = name;
        this.powers = powers;
    }

    public String getPowers(){
        String powersString = "";
        int verified = 0;

        for(HeroSpec power : powers){
            powersString = powersString.concat(power.getString());
            verified ++;
            if (verified != powers.size()) {
                powersString += ", ";
            }
        }

        return powersString;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
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

    public void setPowersString() {
        this.powersString = getPowers();
    }


}
