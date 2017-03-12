package com.mserpa.observerpushmodel.publishers;

import com.mserpa.observerpushmodel.message.Event;


public class PurchasePublisher extends Publisher {

    private Event event;

    public void setEvent(Event event) {
        this.event = event;
        notifyAllSubscribers(this.event);
    }
}
