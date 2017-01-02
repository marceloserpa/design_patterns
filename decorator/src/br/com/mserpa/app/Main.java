package br.com.mserpa.app;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculate pizza value");

        Pizza basePizza = new PlainPizza();
        Pizza completedPizza = new ChickenTopping(new ChesseTopping(basePizza));
        System.out.println("Pizza with chicken and chesse is: " + completedPizza.getPrice());


        Pizza basePizza2 = new PlainPizza();
        Pizza completedPizza2 = new MushroomTopping(new ChesseTopping(new ChesseTopping(basePizza2)));
        System.out.println("Pizza with mushroom and double of chesse is: " + completedPizza2.getPrice());

    }
}
