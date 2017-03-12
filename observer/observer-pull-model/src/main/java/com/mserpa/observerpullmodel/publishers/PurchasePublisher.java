package com.mserpa.observerpullmodel.publishers;

import com.mserpa.observerpullmodel.message.Event;

public class PurchasePublisher extends Publisher {

    private Event event;

    public void setEvent(Event event) {
        this.event = event;
        notifyAllSubscribers();
    }

    @Override
    public Event getEvent() {
        return this.event;
    }
}
