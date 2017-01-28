package com.mserpa.facade.swapi;


import com.mserpa.facade.model.CharacterModel;
import com.mserpa.facade.swapi.rest.SwapiRestClient;
import com.mserpa.facade.swapi.binder.CharacterBinder;
import com.mserpa.facade.swapi.rest.model.CharacterApi;

public class SwapiFacade {

    private SwapiRestClient restClient;

    public SwapiFacade() {
        this.restClient = new SwapiRestClient();
    }

    public CharacterModel findCharacterById(Long id){
        CharacterApi characterApi = restClient.findById(id);
        return CharacterBinder.bindToModel(characterApi);
    }
}
