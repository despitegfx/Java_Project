package service;

public interface MontrealTradedProducts<T>{
    void addNewProduct(T product)throws ProductAlreadyRegisteredException;

    void trade(T product ,int quantity);

    int totalTradeQuantityForDay();

    double totalValueOfDaysTradedProducts();
}
