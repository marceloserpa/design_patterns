package com.mserpa.observerpushmodel.subscribers;

import com.mserpa.observerpushmodel.message.EventType;
import com.mserpa.observerpushmodel.services.StockService;
import com.mserpa.observerpushmodel.message.Event;


public class StockSubscriber implements Subscriber {

    private StockService stockService;

    public StockSubscriber(StockService stockService) {
        this.stockService = stockService;
    }

    public void update(Event event) {
        if(event.getType().equals(EventType.CUSTOMER_PURCHASE_PRODUCT)){
            Integer currentStock = updateStockOfProduct(event);
            System.out.println(buildLogMessage(event, currentStock));
        } else if(event.getType().equals(EventType.INVENTORY_ADD_PRODUCT)){
            stockService.add(event.getProductID(), event.getAmount());
            Integer currentStock = stockService.getStock(event.getProductID());
            System.out.println(buildLogMessage(event, currentStock));
        }
    }

    private String buildLogMessage(Event event, Integer currentStock) {
        return String.format("Product %d have now %d in stock.", event.getProductID(), currentStock);
    }

    private Integer updateStockOfProduct(Event event) {
        return stockService.decrease(event.getProductID(), event.getAmount());
    }
}
