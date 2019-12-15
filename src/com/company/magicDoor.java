package com.company;

public class magicDoor extends Hero {

    public magicDoor() {
    }

    private magicDoor(int health, int healthDamage, int typeofAttack) {
        this.health = health;
        this.healthDamage = healthDamage;
        this.typeofAttack = typeofAttack;

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




