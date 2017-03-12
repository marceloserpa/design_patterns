package com.mserpa.observerpushmodel.subscribers;

import com.mserpa.observerpushmodel.message.Event;


public interface Subscriber {

    void update(Event event);

}
