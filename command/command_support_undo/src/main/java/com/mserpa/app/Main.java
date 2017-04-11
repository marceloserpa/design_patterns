package com.mserpa.app;


import com.mserpa.app.characters.Creature;
import com.mserpa.app.characters.Dragon;
import com.mserpa.app.characters.Magician;
import com.mserpa.app.commands.AttackCommand;
import com.mserpa.app.commands.Command;

public class Main {

    public static void main(String[] args) {

        BattleField battleField = new BattleField();

        Creature redDragon = new Dragon();
        Creature blackMagician = new Magician();

        Command dragonAttackMagician = new AttackCommand(redDragon, blackMagician);

        battleField.perform(dragonAttackMagician);
        battleField.perform(dragonAttackMagician);
        battleField.undo();
        battleField.undo();
        battleField.perform(dragonAttackMagician);
        battleField.undo();
        battleField.redo();
        battleField.redo();

    }

}
