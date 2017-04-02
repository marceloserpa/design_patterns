package com.mserpa.command.app.commands;


import com.mserpa.command.app.characters.Character;

public class DoubleAttackCommand extends Command{

    private Character me;
    private Character target;

    public DoubleAttackCommand(Character me, Character target) {
        this.me = me;
        this.target = target;
    }

    public void execute() {
        me.performSpecialAttack(target);
    }
}
