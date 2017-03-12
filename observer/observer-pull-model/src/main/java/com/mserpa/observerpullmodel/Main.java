package com.mserpa.observerpullmodel;


import com.mserpa.observerpullmodel.message.Event;
import com.mserpa.observerpullmodel.message.EventType;
import com.mserpa.observerpullmodel.publishers.Publisher;
import com.mserpa.observerpullmodel.publishers.PurchasePublisher;
import com.mserpa.observerpullmodel.services.StockService;
import com.mserpa.observerpullmodel.subscribers.DeliverySubscriber;
import com.mserpa.observerpullmodel.subscribers.StockSubscriber;
import com.mserpa.observerpullmodel.subscribers.Subscriber;

public class Main {

    public static void main(String[] args) {

        Publisher purchasePublisher = new PurchasePublisher();

        StockService stockService = new StockService();
        Subscriber stockSubscriber = new StockSubscriber(purchasePublisher, stockService);
        purchasePublisher.attach(stockSubscriber);

        Subscriber deliverySubscriber = new DeliverySubscriber(purchasePublisher);
        purchasePublisher.attach(deliverySubscriber);

        // Change state of publisher
        purchasePublisher.setEvent(new Event(EventType.CUSTOMER_PURCHASE_PRODUCT, 852471L, 1));

        // Pull-model need request data from Publisher
        stockSubscriber.update();
        deliverySubscriber.update();

        // state not changed
        stockSubscriber.update();
        deliverySubscriber.update();

        // Change state of publisher
        purchasePublisher.setEvent(new Event(EventType.CUSTOMER_PURCHASE_PRODUCT, 852471L, 1));

    }



}
