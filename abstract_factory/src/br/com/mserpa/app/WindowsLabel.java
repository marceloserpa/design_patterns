package br.com.mserpa.app;


public class WindowsLabel extends Label {

    @Override
    void draw(String text) {
        System.out.println(createTagButton("Windows", text));
    }

}
