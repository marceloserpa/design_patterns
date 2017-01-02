package br.com.mserpa.app;

public class ChesseTopping extends ToppingDecorator{

    private static final Double CHICKEN_PRICE = 2.50;


    public ChesseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + CHICKEN_PRICE;
    }
}
