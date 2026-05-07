package edu.sdccd.cisc191.model;

public class Player {
    private String name;
    private int hp;
    private int damage = 0;

    public Player(String name) {
        setName(name);
        setHp(hp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "Player";
        } else {
            this.name = name;
        }
    }

    public void setHp(int hp) {
        if (hp <= 0){
            this.hp = 10;
        } else {
            this.hp = hp;
        }
    }

    public int getHp() {
        return hp;
    }

    public int getDamage(){
        return damage;
    }
}
