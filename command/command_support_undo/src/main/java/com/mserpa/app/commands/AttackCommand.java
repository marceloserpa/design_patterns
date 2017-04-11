package com.mserpa.app.commands;


import com.mserpa.app.characters.Creature;

public class AttackCommand implements Command{

    private Creature me;
    private Creature target;

    public AttackCommand(Creature me, Creature target) {
        this.me = me;
        this.target = target;
    }

    public void execute() {
        me.performAttack(target);
    }

    public void undo() {
        target.recovery(me.getPowerAttack());
    }

    public void redo() {
        execute();
    }

}
