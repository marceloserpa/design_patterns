package br.com.mserpa.app.button;

public abstract class Button {

    public abstract void draw(String name, String id);

    public String createTag(String platformName, String name, String id){
        return String.format("Creating %s button[name=%s, id=%s]", platformName, name, id);
    }
}
