package br.com.mserpa.app;

import br.com.mserpa.app.factory.LinuxWidgetFactory;
import br.com.mserpa.app.factory.WidgetFactory;
import br.com.mserpa.app.factory.WindowsWidgetFactory;

public class Main {

    public static void main(String[] args){

        System.out.println("Windows sample");

        WidgetFactory windowsWidgetFactory = new WindowsWidgetFactory();
        PageConstructorClient windowsPageConstructor = new PageConstructorClient(windowsWidgetFactory);
        windowsPageConstructor.render();
        System.out.println("- - - - - - - - - - - - - - ");

        System.out.println("Linux sample");
        WidgetFactory linuxWidgetFactory = new LinuxWidgetFactory();
        PageConstructorClient linuxPageConstructor = new PageConstructorClient(linuxWidgetFactory);
        linuxPageConstructor.render();

    }

}
