package com.mserpa.observerpushmodel.publishers;

import com.mserpa.observerpushmodel.message.Event;


public class InventoryPublisher extends Publisher{

    private Event event;

    @Override
    public void setEvent(Event event) {
        this.event = event;
        notifyAllSubscribers(event);
    }

}
