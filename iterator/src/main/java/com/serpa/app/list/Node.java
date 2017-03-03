package com.serpa.app.list;


public class Node {

    private Card card;

    private Node nextNode;

    public Node(Card card, Node nextNode) {
        this.card = card;
        this.nextNode = nextNode;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
