import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Item> items = new ArrayList<Item>();
		
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
		
		items.add(A);
		items.add(B);
		items.add(C);
		items.add(D);
		
		System.out.println("What would you like?");
		String input = scan.nextLine();
		
		switch(input) {
			case "A":
				A.increaseQuantity(input);
				break;
			case "B":
				B.increaseQuantity(input);
				break;
			case "C":
				C.increaseQuantity(input);
				break;
			case "D":
				D.increaseQuantity(input);
				break;
			default:
				System.out.println("Invalid product");
				break;
		}
		
		boolean shopping = true;
		
		while(shopping) {
			int totals = 0;
			System.out.println("What would you like?");
			input = scan.nextLine();
			
			switch(input) {
				case "A":
					A.increaseQuantity(input);
					break;
				case "B":
					B.increaseQuantity(input);
					break;
				case "C":
					C.increaseQuantity(input);
					break;
				case "D":
					D.increaseQuantity(input);
					break;
				default:
					System.out.println("Invalid product");
					break;
			}
			
			for(Item product : items) {
				totals += product.total;
			}
			System.out.println("The new total is " + totals);
			
		}
	}

}
