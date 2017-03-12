package com.mserpa.observerpullmodel.publishers;

import com.mserpa.observerpullmodel.message.Event;
import com.mserpa.observerpullmodel.subscribers.Subscriber;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public abstract class Publisher {

    private List<Subscriber> subscribers;

    public void attach(Subscriber subscriber){
        if(Objects.isNull(subscribers)) subscribers = new LinkedList<>();
        subscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    protected void notifyAllSubscribers(){
        for(Subscriber subscriber : subscribers){
            subscriber.markStateAsChanged();
        }
    }

    public abstract void setEvent(Event event);

    public abstract Event getEvent();
}
