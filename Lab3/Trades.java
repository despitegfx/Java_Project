

public class Trades{

	public static void main(String[] args)
	{
	
	}

}





public class Trade{

	private String ID;

	private String Symbol;

	private double quantity;

	private double price;

	
	public Trade(String id, String symbol, double quantity, double price)
	{
	
		id = this.ID;
		symbol = this.Symbol;
		quantity = this.quantity;
		price = this.price;
	
	}

	
	public Trade(String id, String symbol, double quantity)
	{
		id = this.ID;
		symbol = this.Symbol;
		quantity = this.quantity;
	
	}


	public void setPrice(String price)
	{
	     this.price = price;
	}

	@Override
	public String  toString(){
	Sytem.out.println(this);

	return (this.ID +" "+ this.Symbol+" "+ this.quantity+" "+ this.price);
	}

}
