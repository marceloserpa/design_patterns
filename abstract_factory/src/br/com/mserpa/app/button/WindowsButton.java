package br.com.mserpa.app.button;

public class WindowsButton extends Button {

    @Override
    public void draw(String name, String id) {
        System.out.println(createTag("Windows", name, id));
    }

}
