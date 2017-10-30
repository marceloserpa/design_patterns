package br.com.mserpa.app.label;

public abstract class Label {

    public abstract void draw(String text);

    public String createTag(String platformName, String name){
        return String.format("Creating %s label[name=%s]", platformName, name);
    }

}
