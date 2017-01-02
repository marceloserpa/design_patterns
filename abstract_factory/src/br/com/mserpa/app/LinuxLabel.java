package br.com.mserpa.app;

public class LinuxLabel extends Label {

    @Override
    public void draw(String text) {
        System.out.println(createTagButton("Linux", text));
    }

}
