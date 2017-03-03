package com.serpa.app;

import com.serpa.app.list.Card;
import com.serpa.app.externaliterator.CardIterator;
import com.serpa.app.list.SimpleCardList;


public class Main {

    public static void main(String[] args) {
        SimpleCardList list = new SimpleCardList();
        list.add(new Card("Summoned Skull"));
        list.add(new Card("Dark Magician"));
        list.add(new Card("Gaia the Fierce Knight"));
        list.add(new Card("Curse of Dragon"));

        CardIterator iterator = list.iterator();
        while(iterator.hasNext()){
            Card card = iterator.next();
            System.out.println(card.getName());
        }

        System.out.println("+++++");
        CardIterator iterator2 = list.iterator();
        while(!iterator2.isDone()){
            Card card = iterator2.next();
            System.out.println(card.getName());
        }

        System.out.println("+++++");
        for(CardIterator iterator3 = list.iterator(); iterator3.hasNext();){
            Card card = iterator3.next();
            System.out.println(card.getName());
        }

    }

}
