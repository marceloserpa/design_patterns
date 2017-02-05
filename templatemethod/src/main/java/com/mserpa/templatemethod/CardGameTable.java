package com.mserpa.templatemethod;


abstract class CardGameTable {

    public void run(){
        prepareDuelist(1);
        prepareDuelist(2);
        System.out.println("Start duel!");
    }

    private void prepareDuelist(Integer profile) {
        System.out.println("Preparing duelist " + profile);
        Integer score = initializeScore();
        System.out.println("Initialize score: " + score);
        shuffleDeck();
        Integer drawFirstHand = initializeHand();
        System.out.println("Hand: " + drawFirstHand);
        System.out.println("Duelist  "+ profile + " Done!\n");
    }

    protected abstract Integer initializeScore();

    protected abstract Integer initializeHand();

    public void drawCard(Integer numberCards){
        System.out.println("Draw " + numberCards + "cards!");
    }

    public void shuffleDeck(){
        System.out.println("Shuffle deck!");
    }

}
