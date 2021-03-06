package com.mserpa.visitor.mathprocessor.node;


public abstract class Node {

    private String value;
    private Node left;
    private Node right;

    public Node(String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
