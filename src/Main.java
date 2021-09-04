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
		
		while(shopping) {
			int totals = 0;
			System.out.println("Would you like to shop? Y or N");
			String input = scan.nextLine();
			
			if(input.equals("Y")) {
				System.out.println("Choose a product");
				input = scan.nextLine();
				
/*				switch(input) {
					case "A":
						A.increaseQuantity(input);
						totals += A.total;
						break;
					case "B":
						B.increaseQuantity(input);
						totals += B.total;
						break;
					case "C":
						C.increaseQuantity(input);
						totals += C.total;
						break;
					case "D":
						D.increaseQuantity(input);
						totals += D.total;
						break;
					default:
						System.out.println("Invalid product");
						break;
*/
				for(int i = 0; i < items.size(); i++) {
					if(items.get(i).getName().equals(input)) {
						System.out.println("You have entered " + items.get(i).getName());
						items.get(i).increaseQuantity(input);
					}
				}

				System.out.println("The new total is " + totals);
			}
			else {
				shopping = false;
			}
		}
	}

}
