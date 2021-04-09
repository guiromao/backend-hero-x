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

    public void editMission(int index, Mission mission){
        missions.set(index - 1, mission);
    }

    public void editMission(int index){
        Mission mission = missions.get(index - 1);
        updateStatus(mission);
    }

    public Mission getMission(int index){
        return missions.get(index - 1);
    }

    private void updateStatus(Mission mission){
        MissionStatus [] totalStatus = MissionStatus.values();
        MissionStatus status = mission.getMissionStatus();

        if(status != MissionStatus.DONE){
            int index = MissionStatus.getIndex(status);

            if(totalStatus[index] == MissionStatus.IN_PROGRESS){
                int earnings = mission.getCompensation();
                if(mission.getHeroId() != null){
                    int currentBalance = managerService.getManager(mission.getHeroId()).getBalance();
                    currentBalance += earnings;
                    managerService.getManager(mission.getHeroId()).setBalance(currentBalance);
                }
            }

            if(index < totalStatus.length - 1){
                status = totalStatus[index + 1];
                mission.setMissionStatus(status);
            }
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

    public void claimMission(Integer hId, Integer mId) {
        Mission mission = missions.get(mId - 1);

        mission.setHeroId(hId);
    }
}
