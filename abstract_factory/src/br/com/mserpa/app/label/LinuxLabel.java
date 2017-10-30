package br.com.mserpa.app.label;

public class LinuxLabel extends Label {

    @Override
    public void draw(String text) {
        System.out.println(createTag("Linux", text));
    }

}
