package br.com.mserpa.app.factory;

import br.com.mserpa.app.button.Button;
import br.com.mserpa.app.label.Label;

public abstract class WidgetFactory {

    abstract public Label createLabel();

    abstract public Button createButton();

}
