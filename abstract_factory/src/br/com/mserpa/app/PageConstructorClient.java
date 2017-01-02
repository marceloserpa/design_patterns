package br.com.mserpa.app;

public class PageConstructorClient {

    private WidgetFactory widgetFactory;

    public PageConstructorClient(WidgetFactory widgetFactory) {
        this.widgetFactory = widgetFactory;
    }

    public void render(){
        Label label = widgetFactory.createLabel();
        label.draw("Do you like Java?");

        Button buttonYes = widgetFactory.createButton();
        buttonYes.draw("Yes", "btn_yes");

        Button buttonNo = widgetFactory.createButton();
        buttonNo.draw("No", "btn_no");
    }
}
