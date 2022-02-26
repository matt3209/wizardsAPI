package com.wizards.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wizards {
    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String profession;

    @Column
    private Integer str;

    @Column
    private Integer dex;

    @Column
    private Integer intel;

    @Column
    private Integer wis;

    @Column
    private Integer chari;

    @Column
    private String spec;

    public Wizards() {}

    public Wizards(Integer id, String name, String profession, Integer str, Integer dex, Integer wis, Integer chari, String spec) {
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.str = str;
        this.dex = dex;
        this.wis = wis;
        this.chari = chari;
        this.spec = spec;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getChari() {
        return chari;
    }

    public void setChari(int chari) {
        this.chari = chari;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getIntel() {
        return intel;
    }

    public void getIntel(int intel) {
        this.intel = intel;
    }

}
