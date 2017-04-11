package com.mserpa.app.commands;


public interface Command {

    void execute();

    void undo();

    void redo();

}
