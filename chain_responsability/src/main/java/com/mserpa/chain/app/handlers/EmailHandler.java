package com.mserpa.chain.app.handlers;

import com.mserpa.chain.app.request.Request;
import com.mserpa.chain.app.request.RequestType;

public class EmailHandler extends Handler {

    public EmailHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.EMAIL.equals(request.getType())){
            System.out.println("Send to EMAIL the message: " + request.getMessage());
        }
        dispatchToNext(request);
    }


}
