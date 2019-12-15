package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.health= 200;
        hero.typeofAttack=30;
        hero.healthDamage=50;

        Boss boss = new Boss();
        boss.health=150;
        boss.typeofDefence=40;
        boss.healthDamage=60;
        boss.changeTypeofDefence();




        System.out.println (hero.health + " " +  hero.healthDamage + " "+hero.typeofAttack);
        System.out.println(boss.health +  " " + boss.healthDamage + " " +boss.typeofDefence);


    }


}
