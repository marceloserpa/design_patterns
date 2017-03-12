package com.mserpa.observerpushmodel.services;

import java.util.HashMap;
import java.util.Map;


public class StockService {

    private Map<Long, Integer> productStock;

    public StockService() {
        this.productStock = new HashMap<Long, Integer>(){{
            put(589621L, 5);
            put(852471L, 10);
        }};
    }

    public Integer getStock(Long productID){
        return productStock.get(productID);
    }

    public void add(Long productID, Integer amount){
        Integer currentStock = getStock(productID);
        productStock.replace(productID, currentStock + amount);
    }

    public Integer decrease(Long productID, Integer amount){
        Integer currentStock = productStock.get(productID);
        Integer newStock = currentStock - amount;
        productStock.replace(productID, newStock);
        return newStock;
    }

}
