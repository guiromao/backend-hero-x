package com.herox.backend;

import com.herox.backend.model.Hero;
import com.herox.backend.model.HeroSpec;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MainTest {

    public static void main(String[] args) {

        Hero hero = new Hero("Batman");
        Set<HeroSpec> specs = new HashSet<>();
        specs.add(HeroSpec.HYPER_SPEED);
        specs.add(HeroSpec.FIRE_BREATH);
        hero.setPowers(specs);
        specs.add(HeroSpec.SUPER_STRENGTH);


    }

}
