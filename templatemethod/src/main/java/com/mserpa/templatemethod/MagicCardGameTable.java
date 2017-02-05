package com.mserpa.templatemethod;


import java.util.Scanner;

public class MagicCardGameTable extends CardGameTable{

    protected Integer initializeScore() {
        return 20;
    }

    protected Integer initializeHand() {
        Integer numberOfCards = 7;
        boolean draw = true;
        Scanner input = new Scanner(System.in);

        while(draw){
            drawCard(numberOfCards);
            System.out.println("1) Keep hand\n 2) Re-draw ");
            String option = input.next();
            if(option.equals("1")){
                draw = false;
            } else if(option.equals("2")){
                if(numberOfCards > 0){
                    numberOfCards--;
                }
            } else {
                System.out.println("invalid option");
            }
        }

        return numberOfCards;
    }
}
