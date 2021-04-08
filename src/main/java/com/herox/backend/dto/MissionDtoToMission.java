package com.herox.backend.dto;

import com.herox.backend.model.missions.Mission;
import com.herox.backend.model.missions.MissionStatus;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

@Component
public class MissionDtoToMission implements Converter<MissionDto, Mission>{


    @Override
    public Mission convert(MissionDto missionDto) {
        Mission mission = new Mission();

        mission.setTitle(missionDto.getTitle());
        mission.setDescription(missionDto.getDescription());
        mission.setCompensation(missionDto.getCompensation());
        mission.setDays(mission.getDays());
        mission.setLocation(missionDto.getLocation());
        mission.setMissionStatus(MissionStatus.READY);

        return mission;
    }
}
