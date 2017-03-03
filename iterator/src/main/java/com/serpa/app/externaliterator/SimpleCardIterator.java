package com.serpa.app.externaliterator;


public class SimpleCardIterator implements CardIterator{

    private SimpleCardList simpleCardList;

    private Node currentNode = null;

    private Integer elements = 0;

    public SimpleCardIterator(SimpleCardList simpleCardList) {
        this.simpleCardList = simpleCardList;
    }


    public Boolean hasNext() {
        if(currentNode == null){
            if(simpleCardList.getFirst() != null){
                return true;
            }
            return false;
        } else if(currentNode.getNextNode() == null){
            return false;
        }
        return true;
    }

    public Card next() {
        if(currentNode == null){
            currentNode = simpleCardList.getFirst();
        } else {
            currentNode = currentNode.getNextNode();
        }
        elements++;
        return currentNode.getCard();
    }

    public Boolean isDone() {
        return simpleCardList.size() <= elements;
    }
}
