package com.herox.backend.model.missions;

import com.herox.backend.model.HeroSpec;
import com.herox.backend.model.Model;

import java.util.List;

public class Mission extends Model {

    private String title;
    private String description;
    private int compensation;
    private int days;
    private String location;
    private MissionStatus missionStatus = MissionStatus.READY;git
    private Integer heroId;
    private List<HeroSpec> neededSpecs;
    private String imgUrl;
    private String neededPowers;

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

    public List<HeroSpec> getNeededSpecs() {
        return neededSpecs;
    }

    public String getLocation() {
        return location;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public String getNeededPowers() {
        return neededPowers;
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

    public void setNeededSpecs(List<HeroSpec> neededSpecs) {
        this.neededSpecs = neededSpecs;

        neededPowers = "";

        for(HeroSpec spec: neededSpecs){
            neededPowers += spec.getString() + ",";
        }
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
