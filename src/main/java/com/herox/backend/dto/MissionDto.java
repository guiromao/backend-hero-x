package com.herox.backend.dto;

import com.herox.backend.model.missions.MissionStatus;

public class MissionDto {

    private String title;
    private String description;
    private int compensation;
    private int days;
    private String location;

    public MissionDto(String title, String desc, int comp, int days, String location){
        this.title = title;
        description = desc;
        compensation = comp;
        this.days = days;
        this.location = location;
    }

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

    public void setCompensation(int compensation) {
        this.compensation = compensation;
    }

}
