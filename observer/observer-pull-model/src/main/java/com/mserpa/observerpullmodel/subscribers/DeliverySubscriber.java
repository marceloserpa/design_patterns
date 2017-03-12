package com.mserpa.observerpullmodel.subscribers;

import com.mserpa.observerpullmodel.message.Event;
import com.mserpa.observerpullmodel.publishers.Publisher;


public class DeliverySubscriber extends Subscriber{

    public DeliverySubscriber(Publisher publisher) {
        super(publisher);
    }

    @Override
    public void update() {
        if(!this.isStateRead()){
            Event event = this.publisher.getEvent();
            System.out.println(String.format("Product %d dispatched for delivery", event.getProductID()));
            this.markStateAsRead();
        } else {
            System.out.println("DeliverySubscriber - State already read");
        }

    }

}
