package com.serpa.app.externaliterator;


import com.serpa.app.list.Card;

public interface CardIterator {

    Boolean hasNext();

    Card next();

    Boolean isDone();

}
