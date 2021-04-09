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
        manager1.setImageUrl("https://powerpuff-girls.s3-ap-southeast-1.amazonaws.com/asia/uploads/galleries/character" +
                "/character1/[…]/3ff53febda16b761648a248f307f663066873051.jpg");
        manager1.setCatchPhrase("Let us advance science to create a better world for all.");

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

        Mission mission2 = new Mission();
        mission2.setTitle("Tsunami");

        missions.add(mission2);

        return missions;
    }

}
