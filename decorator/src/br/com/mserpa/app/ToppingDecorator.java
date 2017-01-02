package br.com.mserpa.app;

public abstract class ToppingDecorator implements Pizza{

    Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice();
    }
}
