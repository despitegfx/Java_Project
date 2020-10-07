public class Trade implements Comparable <Trade> {

    private double price;
    private String Id ;
    private String Symbol;
    private int quantity;


    public Trade(double price, String id, String symbol, int quantity) {
        this.price = price;
        Id = id;
        Symbol = symbol;
        this.quantity = quantity;
    }

    public Trade(String id, String symbol, int quantity) {
        Id = id;
        Symbol = symbol;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "price=" + price +
                ", Id='" + Id + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", quantity=" + quantity +
                '}';
    }


    @Override
    public int compareTo(Trade obj) {
        if(Integer.parseInt(this.getId()) > Integer.parseInt(obj.getId())){
            return 0;
        }
        else
            return -1;
    }
}




