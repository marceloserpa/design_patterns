package com.mserpa.chain.app.handlers;

import com.mserpa.chain.app.request.Request;

import java.util.Objects;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(Request request);

    protected void dispatchToNext(Request request){
        if(Objects.nonNull(this.next))
            this.next.handleRequest(request);
    }

}
