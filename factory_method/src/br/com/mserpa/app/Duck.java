package br.com.mserpa.app;

public class Duck implements Animal {

    @Override
    public Boolean canFly() {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Quack!";
    }

}
