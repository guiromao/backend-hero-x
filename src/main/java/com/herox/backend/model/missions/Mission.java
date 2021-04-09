package com.herox.backend.model.missions;

import com.herox.backend.model.Model;

public class Mission extends Model {

    private String title;
    private String description;
    private int compensation;
    private int days;
    private String location;
    private MissionStatus missionStatus;
    private Integer heroId;

    public Mission(){

    }

    /*public Mission(String title, String desc, int comp, int days, String location,
                   MissionStatus status){
        this.title = title;
        description = desc;
        compensation = comp;
        this.days = days;
        this.location = location;
        missionStatus = status;
    }*/

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCompensation() {
        return compensation;
    }

    public int getDays() {
        return days;
    }

    public String getLocation() {
        return location;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public MissionStatus getMissionStatus() {
        return missionStatus;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setMissionStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }

    public void setCompensation(int compensation) {
        this.compensation = compensation;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }
}
