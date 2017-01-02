package br.com.mserpa.app;


public class WindowsWidgetFactory extends WidgetFactory{

    @Override
    public Label createLabel() {
        return new WindowsLabel();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
