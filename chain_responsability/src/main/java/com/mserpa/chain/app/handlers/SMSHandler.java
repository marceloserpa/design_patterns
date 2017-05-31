package com.mserpa.chain.app.handlers;

import com.mserpa.chain.app.request.Request;
import com.mserpa.chain.app.request.RequestType;

public class SMSHandler extends Handler {

    public SMSHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.SMS.equals(request.getType())){
            System.out.println("Send to SMS :" + request.getMessage());
        }
        dispatchToNext(request);
    }
}
