package br.com.mserpa.app;

public class Cat implements Animal{

    @Override
    public Boolean canFly() {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Miau!";
    }
}
