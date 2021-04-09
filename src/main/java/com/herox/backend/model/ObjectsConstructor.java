package com.herox.backend.model;

import com.herox.backend.model.missions.Mission;
import com.herox.backend.model.missions.MissionStatus;

import java.util.ArrayList;
import java.util.List;

public class ObjectsConstructor {

    public static List<HeroManager> generateManagers(){
        List<HeroManager> managers = new ArrayList<>();

        HeroManager manager1 = new HeroManager();
        manager1.setName("Professor");
        manager1.setLogin("professor123");
        manager1.setPassword("sugarspiceandeverythingnice");

        managers.add(manager1);

        return managers;
    }

    public static List<Mission> generateMissions(){
        List<Mission> missions = new ArrayList<>();

        Mission mission1 = new Mission();
        mission1.setTitle("Getting a cat from a really high tree");
        mission1.setDescription("This is really needed for a super speed and super strong");
        mission1.setCompensation(5000);
        mission1.setMissionStatus(MissionStatus.READY);

        missions.add(mission1);

        return missions;
    }

}
