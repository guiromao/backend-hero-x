package com.herox.backend.services;

import com.herox.backend.model.HeroManager;
import com.herox.backend.model.ObjectsConstructor;
import com.herox.backend.model.missions.Mission;
import com.herox.backend.model.missions.MissionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MissionService {

    private ManagerService managerService;

    private List<Mission> missions = ObjectsConstructor.generateMissions();

    @Autowired
    public void setManagerService(ManagerService service){
        managerService = service;
    }

    public List<Mission> getMissions(){
        return missions;
    }

    public void addMission(Mission mission){
        missions.add(mission);
    }

    public void editMission(int index){
        Mission mission = missions.get(index - 1);
        updateStatus(mission);
    }

    public Mission getMission(int index){
        return missions.get(index - 1);
    }

    private void updateStatus(Mission mission){
        if(mission.getHeroId() != null){
            mission.setMissionStatus(MissionStatus.DONE);
            int balance = managerService.getManager(mission.getHeroId()).getBalance();
            balance += mission.getCompensation();

            managerService.getManager(mission.getHeroId()).setBalance(balance);
        }
    }

    public void deleteMission(int index){
        Mission mission = missions.get(index - 1);

        mission.setHeroId(null);
    }

    public List<Mission> getAvailableMissions() {
        List<Mission> availableMissions = new ArrayList<>();

        for(Mission mission: missions){
            if(mission.getHeroId() == null){
                availableMissions.add(mission);
            }
        }
        return availableMissions;
    }

    public List<Mission> getMissionsByHero(Integer id) {
        List<Mission> missionsOfHero = new ArrayList<>();

        for(Mission mission: missions){
            if (mission.getHeroId() == id){
                missionsOfHero.add(mission);
            }
        }
        return missionsOfHero;
    }

    public boolean claimMission(Integer hId, Integer mId) {
        Mission mission = missions.get(mId - 1);

        if(mission.getId() != null && mission.getHeroId() == null) {
            mission.setHeroId(hId);
            mission.setMissionStatus(MissionStatus.IN_PROGRESS);
            return true;
        }
        return false;
    }

}
