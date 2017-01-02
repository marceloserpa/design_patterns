package br.com.mserpa.app;


public class LinuxWidgetFactory extends WidgetFactory {

    @Override
    public Label createLabel() {
        return new LinuxLabel();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

}
