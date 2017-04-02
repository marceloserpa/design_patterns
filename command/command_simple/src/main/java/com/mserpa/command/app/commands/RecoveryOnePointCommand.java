package com.mserpa.command.app.commands;


import com.mserpa.command.app.characters.Character;

public class RecoveryOnePointCommand extends Command{

    private final static Integer ONE_POINT = 1;
    private Character character;

    public RecoveryOnePointCommand(Character character) {
        this.character = character;
    }

    public void execute() {
        character.recovery(ONE_POINT);
    }
}
