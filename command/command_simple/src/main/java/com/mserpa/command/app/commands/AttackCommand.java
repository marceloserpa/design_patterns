package com.mserpa.command.app.commands;

import com.mserpa.command.app.characters.Character;


public class AttackCommand extends Command {

    private Character me;
    private Character target;

    public AttackCommand(Character me, Character target) {
        this.me = me;
        this.target = target;
    }

    public void execute() {
        System.out.println(me.getName() + " >> " + target.getName());
        me.performAttack(target);
    }
}
