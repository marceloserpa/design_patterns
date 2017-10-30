package br.com.mserpa.app.factory;

import br.com.mserpa.app.button.Button;
import br.com.mserpa.app.button.WindowsButton;
import br.com.mserpa.app.label.Label;
import br.com.mserpa.app.label.WindowsLabel;

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
