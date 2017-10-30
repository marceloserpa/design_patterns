package br.com.mserpa.app.factory;

import br.com.mserpa.app.button.Button;
import br.com.mserpa.app.button.LinuxButton;
import br.com.mserpa.app.label.Label;
import br.com.mserpa.app.label.LinuxLabel;

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
