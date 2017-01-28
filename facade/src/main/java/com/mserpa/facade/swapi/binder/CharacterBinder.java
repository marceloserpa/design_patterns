package com.mserpa.facade.swapi.binder;


import com.mserpa.facade.model.CharacterModel;
import com.mserpa.facade.swapi.rest.model.CharacterApi;

import java.util.Optional;

public class CharacterBinder {

    public static CharacterModel bindToModel(CharacterApi characterApi){
        CharacterModel character = new CharacterModel();
        character.setName(characterApi.getName());
        character.setBirthYear(characterApi.getBirth_year());
        character.setEyeColor(characterApi.getEye_color());
        character.setGender(characterApi.getGender());
        character.setHairColor(characterApi.getHair_color());
        Optional.ofNullable(characterApi.getHeight()).ifPresent(height ->
            character.setHeight(extractHeight(height))
        );
        Optional.ofNullable(characterApi.getMass()).ifPresent(mass ->
            character.setMass(extractMass(mass))
        );
        return character;
    }

    private static Double extractHeight(String height){
        String[] splitedHeight = height.split(" ");
        return Double.parseDouble(splitedHeight[0]);
    }

    private static Double extractMass(String mass){
        String[] splitedMass = mass.split(" ");
        return Double.parseDouble(splitedMass[0]);
    }
}
