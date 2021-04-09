package com.herox.backend.model;

public enum HeroSpec {

    HYPER_SPEED("Hyper speed"),
    SUPER_STRENGTH("Super strength"),
    FLIGHT_ABILITY("Flight ability"),
    X_RAY_VISION("X ray vision"),
    WEATHER_CONTROL("Weather control"),
    FIRE_BREATH("Fire breath");

    private String string;

    HeroSpec(String string){
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
