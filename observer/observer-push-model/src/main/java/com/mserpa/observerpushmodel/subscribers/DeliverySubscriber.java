package com.mserpa.observerpushmodel.subscribers;

import com.mserpa.observerpushmodel.message.Event;


public class DeliverySubscriber implements Subscriber{

    @Override
    public void update(Event event) {
        System.out.println(String.format("Product %d dispatched for delivery", event.getProductID()));
    }

}
