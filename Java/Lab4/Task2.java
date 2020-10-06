import java.util.*;

public class Task2{

public static void main(String[] args){
	List<Trade> trades = new ArrayList<>();
	Trade tr1 =  new Trade("101","TCL",4,400);
	 Trade tr2 =  new Trade("102","LG",10,1000);
	  Trade tr3 =  new Trade("103","APPL",4,2000);
	   Trade tr4 =  new Trade("104","TATA",4);


	   trades.add(tr1);
	   trades.add(tr2);
	   trades.add(tr3);
	   trades.add(tr4);
 
	   System.out.println(trades.size());
}
}


class Trade{
 private String Id;
 private String Symbol;
 private int Quantity;
 private double price;

 public Trade(String id, String symbol, int qty, double price){
	 this.Id = id;
	 this.Symbol = symbol;
 	 this.Quantity = qty;
	 this.price = price;
 }

public Trade(String id, String symbol, int qty ){ 
	this.Id = id;                                                                                                                        this.Symbol = symbol;                                                                                                                this.Quantity = qty;                                                                                                         
}


void setPrice(double price){
 	price = (price > 0) ? price : 0;
	this.price = price;
}

	@Override
        public String toString(){
	return String.format(this.Id+" "+this.Symbol+" "+this.Quantity+" "+this.price);
	}
}
