package com.herox.backend.model;

public class HeroManager extends Model{

    private String name;
    private Hero hero;
    private String login;
    private String password;

    public HeroManager(String name, Hero hero, String login, String password){
        this.name = name;
        this.hero = hero;
        this.login = login;
        this.password = password;
    }

    public java.lang.String getName() {
        return name;
    }

    public Hero getHero() {
        return hero;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
