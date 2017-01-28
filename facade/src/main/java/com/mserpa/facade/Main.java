package com.mserpa.facade;

import com.mserpa.facade.model.CharacterModel;
import com.mserpa.facade.swapi.SwapiFacade;

public class Main {

    public static void main(String[] args){
        SwapiFacade swapi = new SwapiFacade();
        CharacterModel character = swapi.findCharacterById(4L);
        System.out.println(character.getName());
    }

}
