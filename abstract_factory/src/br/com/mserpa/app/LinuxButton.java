package br.com.mserpa.app;


public class LinuxButton extends Button {

    @Override
    public void draw(String name, String id) {
        System.out.println(createTagButton("Linux", name, id));
    }

}
