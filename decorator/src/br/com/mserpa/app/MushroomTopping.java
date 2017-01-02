package br.com.mserpa.app;

public class MushroomTopping extends ToppingDecorator{

    private final static Double MUSHROOM_PRICE = 3.75;

    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + MUSHROOM_PRICE;
    }
}
