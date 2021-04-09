package com.herox.backend.model;

public class IntSecurity {

    private Integer id;
    private String hash;

    public IntSecurity(Integer i, String h){
        id = i;
        hash = h;
    }

    public Integer getId() {
        return id;
    }

    public String getHash() {
        return hash;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
