package service;


public class ProductAlreadyRegisteredException extends Exception{

    public ProductAlreadyRegisteredException(String exception){
        super(exception);
    }

    @Override
    public String toString() {
        return ("Product already registered");
    }
}
