package com.herox.backend.model;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class HeroManager extends Model{

    private String name;
    private Hero hero;
    private String login;
    private String password;
    private String hashPass;
    private int balance = 0;
    private String imageUrl;
    private String catchPhrase;

    public HeroManager(){

    }

    /*public HeroManager(String name, Hero hero, String login, String password){
        this.name = name;
        this.hero = hero;
        this.login = login;
        this.password = password;
    }*/

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

    public String getHashPass() {
        return hashPass;
    }

    public int getBalance() {
        return balance;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
        hashPass = Hashing.sha256()
                .hashString(this.password, StandardCharsets.UTF_8)
                .toString();
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
