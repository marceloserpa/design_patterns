package com.mserpa.observerpushmodel.message;


public class Event {

    private EventType type;
    private Long productID;
    private Integer amount;

    public Event(EventType type, Long productID, Integer amount) {
        this.type = type;
        this.productID = productID;
        this.amount = amount;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
