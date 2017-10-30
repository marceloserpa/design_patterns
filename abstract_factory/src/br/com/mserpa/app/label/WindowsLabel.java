package br.com.mserpa.app.label;


public class WindowsLabel extends Label {

    @Override
    public void draw(String text) {
        System.out.println(createTag("Windows", text));
    }

}
