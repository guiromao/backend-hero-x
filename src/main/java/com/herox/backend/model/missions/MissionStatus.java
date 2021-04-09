package com.herox.backend.model.missions;

public enum MissionStatus {
    READY,
    IN_PROGRESS,
    DONE;

    public static int getIndex(MissionStatus status){
        for(int i = 0; i != MissionStatus.values().length; i++){
            if(MissionStatus.values()[i] == status){
                return i;
            }
        }
        return -1;
    }
}
