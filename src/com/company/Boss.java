package com.company;

public class Boss {
    int health;
    int healthDamage;
    int typeofDefence;

    public Boss() {
    }

    public Boss(int health, int healthDamage, int typeofDefence){
        this.health= health;
        this.healthDamage=healthDamage;
        this.typeofDefence=typeofDefence;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealthDamage() {
        return healthDamage;
    }

    public void setHealthDamage(int healthDamage) {
        this.healthDamage = healthDamage;
    }

    public int getTypeofDefence() {
        return typeofDefence;
    }

    public void setTypeofDefence(int typeofDefence) {
        this.typeofDefence = typeofDefence;
    }

    public void changeTypeofDefence(){
        System.out.println("the Type of Defence has been changed successfully!");
    }



}
