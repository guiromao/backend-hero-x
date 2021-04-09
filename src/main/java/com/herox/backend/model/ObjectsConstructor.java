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
        powerPuff.setImgUrl("images/powerpuff.png");
        powerPuff.setId(1);

        //powerPuff.setPowersString();

        List<HeroManager> managers = new ArrayList<>();

        HeroManager manager1 = new HeroManager();
        manager1.setName("Prof. Utonium");
        manager1.setLogin("professor123");
        manager1.setHero(powerPuff);
        manager1.setPassword("sugarspiceandeverythingnice");
        manager1.setImageUrl("images/professor.png");
        manager1.setCatchPhrase("Let us advance science to create a better world for all.");
        manager1.setId(1);

        managers.add(manager1);

        Set<HeroSpec> skillsBatman = new HashSet<>();
        skillsBatman.add(HeroSpec.SUPER_STRENGTH);

        Hero batman = new Hero("Batman", skillsBatman);
        batman.setImgUrl("images/batman.png");
        batman.setId(2);

        HeroManager alfred = new HeroManager();
        alfred.setHero(batman);
        alfred.setName("Alfred");
        alfred.setLogin("alfred");
        alfred.setPassword("bats123");
        alfred.setCatchPhrase("Bats are cool");
        alfred.setImageUrl("images/alfred.png");
        alfred.setId(2);

        managers.add(alfred);

        Set<HeroSpec> setSuperman = new HashSet<>();
        setSuperman.add(HeroSpec.SUPER_STRENGTH);
        setSuperman.add(HeroSpec.HYPER_SPEED);
        setSuperman.add(HeroSpec.X_RAY_VISION);
        setSuperman.add(HeroSpec.FLIGHT_ABILITY);
        setSuperman.add(HeroSpec.WEATHER_CONTROL);

        Hero superman = new Hero("Superman", setSuperman);
        superman.setId(3);

        HeroManager loisLane = new HeroManager();
        loisLane.setId(3);
        loisLane.setHero(superman);
        loisLane.setName("Lois Lane");
        loisLane.setImageUrl("images/loislane.png");
        loisLane.setLogin("lane");
        loisLane.setPassword("superlove");
        loisLane.setCatchPhrase("My love will get me high");

        managers.add(loisLane);

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
        mission1.setImgUrl("images/cat.png");
        mission1.setId(1);

        missions.add(mission1);

        Mission mission2 = new Mission();
        mission2.setTitle("Tsunami");
        mission2.setDescription("A tsunami will soon swallow a whole city. Please help evacuate this city, and " +
                "try to stop the big wave!");
        mission2.setCompensation(4000);
        mission2.setNeededSpecs(Arrays.asList(HeroSpec.FLIGHT_ABILITY, HeroSpec.WEATHER_CONTROL, HeroSpec.SUPER_STRENGTH));
        mission2.setMissionStatus(MissionStatus.READY);
        mission2.setImgUrl("images/tsunami.png");
        mission2.setId(2);

        missions.add(mission2);

        Mission mission3 = new Mission();
        mission3.setTitle("Building on fire!");
        mission3.setDescription("Need to help people from building on fire!");
        mission3.setCompensation(10000);
        mission3.setNeededSpecs(Arrays.asList(HeroSpec.X_RAY_VISION, HeroSpec.HYPER_SPEED));
        mission3.setImgUrl("images/fire.png");
        mission3.setMissionStatus(MissionStatus.READY);
        mission3.setId(3);

        missions.add(mission3);

        Mission mission4 = new Mission();
        mission4.setTitle("Slow down the global warming!");
        mission4.setDescription("We need to develop a new set of skills in order to slow" +
                "down global warming!");
        mission4.setCompensation(40000);
        mission4.setNeededSpecs(Arrays.asList(HeroSpec.WEATHER_CONTROL, HeroSpec.FLIGHT_ABILITY, HeroSpec.X_RAY_VISION
        , HeroSpec.HYPER_SPEED));
        mission4.setMissionStatus(MissionStatus.READY);
        mission4.setImgUrl("images/global_warming.png");
        mission4.setId(4);

        missions.add(mission4);

        Mission mission5 = new Mission();
        mission5.setTitle("Lex Luthor at it again!");
        mission5.setDescription("It seems like Lex Luthor is doing is own deeds, once again!");
        mission5.setCompensation(20000);
        mission5.setNeededSpecs(Arrays.asList(HeroSpec.SUPER_STRENGTH, HeroSpec.HYPER_SPEED,
                HeroSpec.X_RAY_VISION));
        mission5.setMissionStatus(MissionStatus.READY);
        mission5.setImgUrl("images/luthor.png");
        mission5.setId(5);

        missions.add(mission5);

        Mission mission6 = new Mission();
        mission6.setTitle("Giant Spiders in the city.");
        mission6.setDescription("Please save the city from the giant spiders!");
        mission6.setCompensation(11000);
        mission6.setNeededSpecs(Arrays.asList(HeroSpec.FIRE_BREATH, HeroSpec.HYPER_SPEED));
        mission6.setImgUrl("images/spiders.png");
        mission6.setMissionStatus(MissionStatus.READY);
        mission6.setId(6);

        missions.add(mission6);

        return missions;
    }

}
