package br.com.mserpa.app.button;


public class LinuxButton extends Button {

    @Override
    public void draw(String name, String id) {
        System.out.println(createTag("Linux", name, id));
    }

}
