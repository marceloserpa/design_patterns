package com.mserpa.command.app;


import com.mserpa.command.app.characters.Character;
import com.mserpa.command.app.characters.Dragon;
import com.mserpa.command.app.characters.Magician;
import com.mserpa.command.app.commands.Command;
import com.mserpa.command.app.commands.AttackCommand;
import com.mserpa.command.app.commands.RecoveryOnePointCommand;
import com.mserpa.command.app.commands.DoubleAttackCommand;

public class Main {

    public static void main(String[] args) {

        Character dragon = new Dragon();
        Character magician = new Magician();

        Command dragonAttackCommand = new AttackCommand(dragon, magician);
        Command magicianAttackCommand = new AttackCommand(magician, dragon);
        Command recoveryMagicianCommand = new RecoveryOnePointCommand(magician);
        Command dragonSpecialAttackCommand = new DoubleAttackCommand(dragon, magician);

        BattleField battleField = new BattleField();

        battleField.perform(dragonAttackCommand);
        battleField.perform(magicianAttackCommand);
        battleField.perform(magicianAttackCommand);
        battleField.perform(dragonAttackCommand);

        battleField.perform(recoveryMagicianCommand);
        battleField.perform(dragonSpecialAttackCommand);
    }

}
