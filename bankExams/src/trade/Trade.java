package trade;

import service.MontrealTradedProducts;
import service.ProductAlreadyRegisteredException;

import java.util.List;
import java.util.ArrayList;

public class Trade <T> implements MontrealTradedProducts<T>{
    List<T> trades = new ArrayList<>();


    @Override
    public void addNewProduct(T product) throws ProductAlreadyRegisteredException {
        for(T trade_item : trades){
            if(trade_item.equals(product)) throw new ProductAlreadyRegisteredException("Product already registered");
            else trades.add(product);
        }
    }

    @Override
    public void trade(T product, int quantity) {
        
    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
