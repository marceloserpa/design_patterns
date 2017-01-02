package br.com.mserpa.app;


public class WindowsButton extends Button {

    @Override
    void draw(String name, String id) {
        System.out.println(createTagButton("Windows", name, id));
    }

}
