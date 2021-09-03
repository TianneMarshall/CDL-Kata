
public class Item {

	private int item_price;
	private int currentQuantity;
	private int multiQuantity;
	private int total;
	private int multiPrice;
	
	public Item() {
		
	}
	
	public int getPrice() {
		return item_price;
	}
	
	public void setPrice(int price) {
		this.item_price = price;
	}
	
	public void setMultibuy(int quantity, int multiPrice) {
		this.multiQuantity = quantity;
		this.multiPrice = multiPrice;
	}
	
	public void increaseQuantity(String item) {
		currentQuantity += 1; 
		total += item_price;
		if(currentQuantity % multiQuantity == 0) { 
			// calculate the none discount price and minus the new discount price to get the difference
			int discount = (item_price * multiQuantity) - multiPrice;
			total -= discount;
		}
		System.out.println(total);
	}
	
}
