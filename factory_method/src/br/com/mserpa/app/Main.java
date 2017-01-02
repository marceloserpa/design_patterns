package br.com.mserpa.app;

public class Main {

    public static void main(String[] args) {

        AnimalCreator creator = new AnimalCreatorFactory();

        Animal cat = creator.createAnimal("C");
        System.out.println("Cat make " + cat.makeNoise() + " and can fly is " + cat.canFly());

        Animal duck = creator.createAnimal("D");
        System.out.println("Duck make " + duck.makeNoise() + " and can fly is " + duck.canFly());
    }
}
