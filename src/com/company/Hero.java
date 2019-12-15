package com.company;

import java.time.chrono.ThaiBuddhistEra;

public class Hero {

    int health;
    int healthDamage;
    int typeofAttack;

    public Hero() {
    }

    private Hero(int health, int healthDamage, int typeofAttack){
        this.health = health;
        this.healthDamage=healthDamage;
        this.typeofAttack=typeofAttack;
    }
    private int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    private int getHealthDamage() {
        return healthDamage;
    }

    private void setHealthDamage(int healthDamage) {
        this.healthDamage = healthDamage;
    }

    private int getTypeofAttack() {
        return typeofAttack;
    }

    private void setTypeofAttack(int typeofAttack) {
        this.typeofAttack = typeofAttack;
    }
}

