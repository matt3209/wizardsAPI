package com.wizards.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wizards {
    @Id
    private Integer id;

    @Column
    private String region;

    @Column
    private Integer level;

    @Column
    private Integer str;

    @Column
    private Integer speed;

    @Column
    private Integer intel;

    @Column
    private Integer stamina;

    @Column
    private Integer spells;

    @Column
    private String type;

    @Column
    private String name;

    @Column
    private String profession;

    @Column
    private Integer xp;

    @Column
    private Integer usedxp;

    @Column
    private Integer onquest;

    @Column
    private Integer queststart;

    @Column
    private Integer questend;

    @Column
    private Integer questxp;

    @Column
    private String spelllist;


    public Wizards() {}



    public Wizards(Integer id, String region, Integer level, String  name, String profession, Integer str, Integer speed, Integer stamina, Integer spells, String type, Integer queststart, Integer questend, Integer questxp, Integer onquest, Integer usedxp, Integer xp, String spelllist) {
        this.id = id;
        this.region = region;
        this.level = level;
        this.str = str;
        this.speed = speed;
        this.stamina = stamina;
        this.spells = spells;
        this.type = type;
        this.name = name;
        this.profession = profession;
        this.xp = xp;
        this.usedxp = usedxp;
        this.onquest = onquest;
        this.queststart = queststart;
        this.questend = questend;
        this.questxp = questxp;
        this.spelllist = spelllist;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpells() {
        return spells;
    }

    public void setSpells(int spells) {
        this.spells = spells;
    }

    public String getType() {
        return type;
    }

    public void setType(String spec) {
        this.type = spec;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getQuestXP() {
        return questxp;
    }

    public void setQuestXP(Integer questxp) {
        this.questxp = questxp;
    }

    public Integer getQuestEnd() {
        return questend;
    }

    public void setQuestEnd(Integer questend) {
        this.questend = questend;
    }

    public Integer getQuestStart() {  return queststart;   }

    public void setQuestStart(Integer queststart) {
        this.queststart = queststart;
    }

    public Integer getOnQuest() {
        return onquest;
    }

    public void setOnQuest(Integer onquest) {
        this.onquest = onquest;
    }

    public Integer getUsedxp() {
        return usedxp;
    }

    public void setUsedxp(Integer usedxp) {
        this.usedxp = usedxp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public String getSpellList() {
        return spelllist;
    }

    public void setSpellList(String spelllist) {
        this.spelllist = spelllist;
    }
}
