package com.mserpa.observerpullmodel.subscribers;

import com.mserpa.observerpullmodel.message.Event;
import com.mserpa.observerpullmodel.publishers.Publisher;
import com.mserpa.observerpullmodel.services.StockService;


public class StockSubscriber extends Subscriber {

    private StockService stockService;

    public StockSubscriber(Publisher publisher, StockService stockService) {
        super(publisher);
        this.stockService = stockService;
    }

    @Override
    public void update() {
        if(!this.isStateRead()){
            Event event = this.publisher.getEvent();
            Integer currentStock = updateStockOfProduct(event);
            System.out.println(buildLogMessage(event, currentStock));
            this.markStateAsRead();
        } else {
            System.out.println("StockSubscriber - State already read");
        }
    }

    private String buildLogMessage(Event event, Integer currentStock) {
        return String.format("Product %d have now %d in stock.", event.getProductID(), currentStock);
    }

    private Integer updateStockOfProduct(Event event) {
        return stockService.decrease(event.getProductID(), event.getAmount());
    }

}
