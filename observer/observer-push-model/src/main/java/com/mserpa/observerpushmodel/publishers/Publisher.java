package com.mserpa.observerpushmodel.publishers;

import com.mserpa.observerpushmodel.message.Event;
import com.mserpa.observerpushmodel.subscribers.Subscriber;

import java.util.*;


public abstract class Publisher {

    private List<Subscriber> subscribers;

    public void attach(Subscriber subscriber){
        if(Objects.isNull(subscribers)) subscribers = new LinkedList<>();
        subscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    protected void notifyAllSubscribers(Event event){
        Iterator<Subscriber> iterator = subscribers.iterator();
        while(iterator.hasNext()){
            Subscriber subscriber = iterator.next();
            subscriber.update(event);
        }
    }

    public abstract void setEvent(Event event);
}
