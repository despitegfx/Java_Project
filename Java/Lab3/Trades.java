

public class Trades{

	public static void main(String[] args)
	{
		Trade trade = new Trade("101","APPL",20,2000);
		System.out.println(trade.toString());
		
		Trade trades[] = {new Trade("101","APPL",20,2000),new Trade("1022","LG",20,2000),new Trade("1001","TCL",20,2000)};
		
		
		Account Seth = new Account(trades);
	}

}





 class Trade{

	private String ID;
	private String Symbol;
	private int quantity;
	private double price;
	
	public Trade(String id, String symbol, int quantity, double price)
	{
	
		 this.ID = id;
		 this.Symbol = symbol;
		 this.quantity = quantity;
		this.price = price;
	
	}

	
	public Trade(String id, String symbol, int quantity)
	{
		this.ID = id;
		this.Symbol = symbol;
		this.quantity = quantity;
	
	}


	public void setPrice(double price)
	{    price = (price > 0) ? price : 0;
	     this.price = price;
	}

	@Override
	public String toString(){
	return ( this.ID +" "+ this.Symbol+" "+ Integer.toString(this.quantity)+" "+ Double.toString(this.price));
	}

}



 class Account {
	private int total_trade = 0;
	private int size =0;
	private Trade[] trade;

	public Account(Trade[] trade){
	this.trade = trade;
	size = trade.length;
	}
	


	public int getTotal_trade(){
	if(this.trade != null){
		for(int i = 0; i < this.size; i++){
			 this.total_trade++;
	}
	}
		
		return this.total_trade;
	}

	public void setTotal_trade(int tot_trade){
	this.total_trade = tot_trade;
	}
}




class Trader extends Account {

}


