package com.herox.backend.model;

public class Band {

    private String name;
    private String styles;
    private int year;
    private String country;

    public Band(String name, String styles, int year, String country){
        this.name = name;
        this.styles = styles;
        this.year = year;
        this.country = country;
    }

    public String getName(){
        return name;
    }

    public String getStyles() {
        return styles;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
