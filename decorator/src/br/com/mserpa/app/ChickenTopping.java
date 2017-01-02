package br.com.mserpa.app;


public class ChickenTopping extends ToppingDecorator {

    private static final Double CHICKEN_PRICE = 5D;

    public ChickenTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + CHICKEN_PRICE;
    }
}
