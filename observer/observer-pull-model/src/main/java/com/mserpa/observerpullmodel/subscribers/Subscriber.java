package com.mserpa.observerpullmodel.subscribers;


import com.mserpa.observerpullmodel.publishers.Publisher;

public abstract class Subscriber {

    Publisher publisher;
    Boolean stateRead;

    protected Subscriber(Publisher publisher){
        this.publisher = publisher;
    }

    public Boolean markStateAsChanged(){
        this.stateRead = false;
        return this.stateRead;
    }

    public Boolean markStateAsRead(){
        this.stateRead = true;
        return this.stateRead;
    }

    public Boolean isStateRead(){
        return this.stateRead;
    }

    public abstract void update();

}
