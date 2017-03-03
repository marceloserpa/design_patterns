package com.serpa.app.list;


import com.serpa.app.externaliterator.CardIterable;
import com.serpa.app.externaliterator.CardIterator;
import com.serpa.app.externaliterator.SimpleCardIterator;


public class SimpleCardList implements CardIterable {

    private Integer length = 0;
    private Node firstNode = null;

    public void add(Card element){
        if(firstNode == null){
            this.firstNode = new Node(element, null);
        } else {
            Node node = firstNode;
            while(node.getNextNode() != null){
                node = node.getNextNode();
            }
            node.setNextNode(new Node(element, null));
        }
        length++;
    }

    public Integer size(){
        return length;
    }

    public Node getFirst(){
        if(firstNode == null) return null;
        return firstNode;
    }

    public CardIterator iterator() {
        return new SimpleCardIterator(this);
    }
}
