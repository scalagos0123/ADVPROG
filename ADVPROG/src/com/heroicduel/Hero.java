package com.heroicduel;

public class Hero {
    private int atk;
    private int def;
    private int hp;
    private int mag;
    private int res;
    private int maxHP;
    private String name;
    
    public Hero(String name, int atk, int def, int hp) {
        this.name = name;
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.maxHP = hp;
    }
    
    public Hero(String name, int atk, int def, int hp, int mag, int res) {
        this(name, atk, def, hp);
        this.mag = mag;
        this.res = res;
        this.maxHP = hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getHp() {
        return hp;
    }
    

    public String getName() {
        return name;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getMag() {
        return mag;
    }

    public int getRes() {
        return res;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;  
    }
    
    public int getMaxHP() {
        return maxHP;
    }
    
    public int attack (Hero h) {
        int damage = this.atk * 100 - h.getDef() * 100;
        
        if (damage < 0) {
            damage = damage * -1;
        }
        
        int newHP = h.getHp() - damage;
        
        if (newHP < 0) {
        	newHP = 0;
        }
        
        h.setHp(newHP);
        return damage;
    }
    
    public int spell (Hero h) {
        int spelldam = (this.mag * 100 - h.getRes() * 100) * (h.getHp() / h.getMaxHP());
        
        if (spelldam < 0) {
            spelldam = spelldam * -1;
        }
        
        int newHP = h.getHp() - spelldam;
        
        if (newHP < 0) {
        	newHP = 0;
        }
        
        h.setHp(newHP);
        return spelldam;
        
    }
}