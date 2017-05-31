package com.mserpa.chain.app;

import com.mserpa.chain.app.handlers.EmailHandler;
import com.mserpa.chain.app.handlers.Handler;
import com.mserpa.chain.app.handlers.PushHandler;
import com.mserpa.chain.app.handlers.SMSHandler;
import com.mserpa.chain.app.request.Request;
import com.mserpa.chain.app.request.RequestType;

public class Application {

    public static void main(String[] args) {

        Handler smsHandler = new SMSHandler(null);
        Handler emailHandler = new EmailHandler(smsHandler);
        Handler pushHandler = new PushHandler(emailHandler);

        Request request = new Request();
        request.setMessage("Hello World");
        request.setType(RequestType.SMS);

        pushHandler.handleRequest(request);

    }

}
