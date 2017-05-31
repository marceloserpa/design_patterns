package com.mserpa.chain.app.handlers;

import com.mserpa.chain.app.request.Request;
import com.mserpa.chain.app.request.RequestType;

public class PushHandler extends Handler {

    public PushHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.PUSH.equals(request.getType())){
            System.out.println("Sending push notification: " + request.getMessage());
        }
        dispatchToNext(request);
    }
}
