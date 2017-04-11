package com.mserpa.app.characters;


public abstract class Creature {

    private Integer health;
    private Integer powerAttack;
    private String name;

    public Creature(Integer health, Integer powerAttack, String name) {
        this.health = health;
        this.powerAttack = powerAttack;
        this.name = name;
    }

    private void displayStatus() {
        System.out.println("Name: " + name + " Health: " + health + " Power Attack: " + powerAttack);
    }

    public void receiveDamage(Integer powerAttackOpponent){
        health -= powerAttackOpponent;
        System.out.println(name + " lose " + powerAttackOpponent + " health point.");
        displayStatus();
        if(health <= 0 ){
            System.out.println(name + " is dead... ");
        }
    }

    public void performAttack(Creature target){
        target.receiveDamage(powerAttack);
    }

    public void performSpecialAttack(Creature target){
        target.receiveDamage(powerAttack * 2);
    }


    public void recovery(Integer healthPoints){
        System.out.println(name + " recovery " + healthPoints + " health point.");
        health += healthPoints;
        displayStatus();
    }

    public String getName() {
        return name;
    }

    public Integer getPowerAttack() {
        return powerAttack;
    }
}
