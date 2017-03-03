package com.serpa.app.externaliterator;


public interface CardIterator {

    Boolean hasNext();

    Card next();

    Boolean isDone();

}
