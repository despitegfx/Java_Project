package products;


public class Stocks {
    private String ID;
    private double value;
    private int qty;

    public Stocks(String ID, double value, int qty) {
        this.ID = ID;
        this.value = value;
        this.qty = qty;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
