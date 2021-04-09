package com.herox.backend.model;

import com.herox.backend.model.missions.Mission;
import com.herox.backend.model.missions.MissionStatus;

import java.util.*;

public class ObjectsConstructor {

    public static List<HeroManager> generateManagers(){

        Set<HeroSpec> powers = new HashSet();
        powers.add(HeroSpec.FLIGHT_ABILITY);
        powers.add(HeroSpec.SUPER_STRENGTH);
        powers.add(HeroSpec.X_RAY_VISION);
        powers.add(HeroSpec.HYPER_SPEED);

        Hero powerPuff = new Hero("Powerpuff Girls", powers);

        List<HeroManager> managers = new ArrayList<>();

        HeroManager manager1 = new HeroManager();
        manager1.setName("Prof. Utonium");
        manager1.setLogin("professor123");
        manager1.setHero(powerPuff);
        manager1.setPassword("sugarspiceandeverythingnice");
        manager1.setImageUrl("images/professor.png");
        manager1.setCatchPhrase("Let us advance science to create a better world for all.");

        managers.add(manager1);

        Set<HeroSpec> skillsBatman = new HashSet<>();
        skillsBatman.add(HeroSpec.SUPER_STRENGTH);

        Hero batman = new Hero("Batman", skillsBatman);

        HeroManager alfred = new HeroManager();
        alfred.setHero(batman);
        alfred.setName("Alfred");
        alfred.setLogin("alfred");
        alfred.setPassword("bats123");
        alfred.setCatchPhrase("Bats are cool");
        alfred.setImageUrl("images/alfred.png");

        managers.add(alfred);

        return managers;
    }

    public static List<Mission> generateMissions(){
        List<Mission> missions = new ArrayList<>();

        Mission mission1 = new Mission();
        mission1.setTitle("Getting a cat from a really high tree");
        mission1.setDescription("This is really needed for a super speed and super strong");
        mission1.setCompensation(5000);
        mission1.setNeededSpecs(Arrays.asList(HeroSpec.FLIGHT_ABILITY));
        mission1.setMissionStatus(MissionStatus.READY);

        missions.add(mission1);

        Mission mission2 = new Mission();
        mission2.setTitle("Tsunami");
        mission2.setDescription("A tsunami will soon swallow a whole city. Please help evacuate this city, and " +
                "try to stop the big wave!");
        mission2.setCompensation(4000);
        mission2.setNeededSpecs(Arrays.asList(HeroSpec.FLIGHT_ABILITY, HeroSpec.WEATHER_CONTROL, HeroSpec.SUPER_STRENGTH));
        mission2.setMissionStatus(MissionStatus.READY);

        missions.add(mission2);

        Mission mission3 = new Mission();
        mission3.setTitle("Building on fire!");
        mission3.setDescription("Need to help people from building on fire!");
        mission3.setCompensation(10000);
        mission3.setNeededSpecs(Arrays.asList(HeroSpec.X_RAY_VISION, HeroSpec.HYPER_SPEED));

        missions.add(mission3);

        Mission mission4 = new Mission();
        mission4.setTitle("Slow down the global warming!");
        mission4.setDescription("We need to develop a new set of skills in order to slow" +
                "down global warming!");
        mission4.setCompensation(40000);
        mission4.setNeededSpecs(Arrays.asList(HeroSpec.WEATHER_CONTROL, HeroSpec.FLIGHT_ABILITY, HeroSpec.X_RAY_VISION
        , HeroSpec.HYPER_SPEED));

        missions.add(mission4);

        missions.add(mission2);

        return missions;
    }

}
