
public class Item {

	private int price;
	private int quantity;
	private int total;
	private int multiPrice;
	
	public Item() {
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setMultibuy(int quantity, int multiPrice) {
		this.quantity = quantity;
		this.multiPrice = multiPrice;
	}
}
