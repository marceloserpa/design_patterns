package br.com.mserpa.app;

abstract class Label {

    abstract void draw(String text);

    public String createTagButton(String platformName, String name){
        return String.format("Creating %s label[name=%s]", platformName, name);
    }

}
