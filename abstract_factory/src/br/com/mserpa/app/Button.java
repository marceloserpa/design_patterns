package br.com.mserpa.app;

abstract class Button {

    abstract void draw(String name, String id);

    public String createTagButton(String platformName, String name, String id){
        return String.format("Creating %s button[name=%s, id=%s]", platformName, name, id);
    }
}
