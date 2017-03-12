package com.mserpa.observerpushmodel;

import com.mserpa.observerpushmodel.message.Event;
import com.mserpa.observerpushmodel.message.EventType;
import com.mserpa.observerpushmodel.publishers.InventoryPublisher;
import com.mserpa.observerpushmodel.publishers.Publisher;
import com.mserpa.observerpushmodel.publishers.PurchasePublisher;
import com.mserpa.observerpushmodel.services.StockService;
import com.mserpa.observerpushmodel.subscribers.DeliverySubscriber;
import com.mserpa.observerpushmodel.subscribers.StockSubscriber;
import com.mserpa.observerpushmodel.subscribers.Subscriber;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Publisher purchasePublisher = new PurchasePublisher();

        StockService stockService = new StockService();
        Subscriber stockListener = new StockSubscriber(stockService);
        purchasePublisher.attach(stockListener);

        Subscriber deliverySubscriber = new DeliverySubscriber();
        purchasePublisher.attach(deliverySubscriber);

        List<Event> events = new LinkedList<>();
        events.add(new Event(EventType.CUSTOMER_PURCHASE_PRODUCT, 852471L, 1));
        events.add(new Event(EventType.CUSTOMER_PURCHASE_PRODUCT, 589621L, 1));
        events.add(new Event(EventType.CUSTOMER_PURCHASE_PRODUCT, 589621L, 2));
        events.add(new Event(EventType.CUSTOMER_PURCHASE_PRODUCT, 852471L, 1));
        events.add(new Event(EventType.CUSTOMER_PURCHASE_PRODUCT, 589621L, 2));

        events.stream().forEach(processEvents(purchasePublisher));

        System.out.println("------- INVENTORY --------");
        Publisher inventoryPublisher = new InventoryPublisher();
        inventoryPublisher.attach(stockListener);

        List<Event> event2 = new LinkedList<>();
        event2.add(new Event(EventType.INVENTORY_ADD_PRODUCT, 852471L, 6));
        event2.add(new Event(EventType.INVENTORY_ADD_PRODUCT, 589621L, 3));

        event2.stream().forEach(processEvents(inventoryPublisher));

        // Remove a observer and run again
        System.out.println("------------------");
        System.out.println("DeliverySubscriber detached");
        purchasePublisher.detach(deliverySubscriber);
        events.stream().forEach(processEvents(purchasePublisher));

    }

    private static Consumer<Event> processEvents(Publisher publisher) {
        return event -> publisher.setEvent(event);
    }

}
