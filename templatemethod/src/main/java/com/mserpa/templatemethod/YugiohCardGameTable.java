package com.mserpa.templatemethod;


public class YugiohCardGameTable extends CardGameTable {

    protected Integer initializeScore() {
        return 8000;
    }

    protected Integer initializeHand() {
        Integer firstHand = 5;
        drawCard(firstHand);
        return firstHand;
    }

}
