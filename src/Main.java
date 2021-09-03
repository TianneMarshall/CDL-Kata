import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
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
		
		System.out.println("What would you like?");
		String input = scan.nextLine();
		
		if(input.equals("A")) {
			A.increaseQuantity(input);
		}
		boolean shopping = true;
		while(shopping) {
			System.out.println("What would you like?");
			input = scan.nextLine();
			
			if(input.equals("A")) {
				A.increaseQuantity(input);
			}
		}
	}

}
