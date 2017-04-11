package com.mserpa.app;

import com.mserpa.app.commands.Command;

import java.util.EmptyStackException;
import java.util.Stack;

public class BattleField {

    private Stack<Command> history;
    private Stack<Command> undoCommand;

    public BattleField() {
        this.history = new Stack<>();
        this.undoCommand = new Stack<>();
    }

    public void perform(Command command){
        command.execute();
        history.push(command);
        undoCommand.clear();
    }

    public void undo(){
        System.out.println("Undo");
        try {
            Command lastCommand = history.pop();
            lastCommand.undo();
            undoCommand.push(lastCommand);
        }catch (EmptyStackException emptyStackException){
            System.out.println("History is empty");
        }
    }
    
    public void redo(){
        System.out.println("Redo");
        try {
            Command mostRecentCommand = undoCommand.pop();
            mostRecentCommand.redo();
            history.push(mostRecentCommand);
        }catch (EmptyStackException emptyStackException){
            System.out.println("Nothing to re-do");
        }
    }

}
