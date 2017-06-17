package com.mserpa.memento.app;


public class Application {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("A");
        careTaker.add(originator.save());

        originator.setState("B");
        careTaker.add(originator.save());

        originator.setState("C");
        System.out.println("Current state: " + originator.getState());

        originator.restore(careTaker.restore());
        System.out.println("Current state: " + originator.getState());

        originator.restore(careTaker.restore());
        System.out.println("Current state: " + originator.getState());
    }

}
