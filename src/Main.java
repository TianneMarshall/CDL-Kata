
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item A = new Item();
		Item B = new Item();
		Item C = new Item();
		Item D = new Item();
		
		A.setPrice(50);
		// first parameter is the quantity in multibuy offer, second parameter is the new discount price
		A.setMultibuy(3, 130);
		
		B.setPrice(30);
		B.setMultibuy(2, 45);
		
		C.setPrice(20);
		
		D.setPrice(15);
	}

}
