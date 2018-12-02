package commandPattern;

public class CommandPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
		
		BuyStock buy = new BuyStock(stock);
		SellStock sell = new SellStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrder(buy);
		broker.takeOrder(sell);
		
		broker.placeOrder();
	}

}
