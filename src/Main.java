import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Item> items = new ArrayList<Item>();
		
		Item A = new Item("A");
		Item B = new Item("B");
		Item C = new Item("C");
		Item D = new Item("D");
		
		A.setPrice(50);
		// first parameter is the quantity in multibuy offer, second parameter is the new discount price
		A.setMultibuy(3, 130);
		
		B.setPrice(30);
		B.setMultibuy(2, 45);
		
		C.setPrice(20);
		
		D.setPrice(15);
		
		items.add(A);
		items.add(B);
		items.add(C);
		items.add(D);
		
		boolean shopping = true;
		int totals = 0;
		while(shopping) {
			System.out.println("Would you like to shop? Y or N");
			String input = scan.nextLine();
			
			if(input.equals("Y")) {
				totals = 0;
				System.out.println("Choose a product");
				input = scan.nextLine();
				
				for(int i = 0; i < items.size(); i++) {
					if(items.get(i).getName().equals(input)) {
						items.get(i).increaseQuantity(input);
					}
					totals += items.get(i).total;  // calculate running total
				}
				System.out.println("Your total is " + totals);
			}
			else {
				System.out.println("Your complete total is " + totals);
				shopping = false;
			}
		}
	}
}
