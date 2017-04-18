// Mike Vealey
// CSIT211
// Spring 2017

import java.util.Scanner;

public class IntegerReader {

	public static void main(String[] args) {
		int[] integerArray = new int[10];
		int index = 0;
		boolean stillNeedMoreIntegers = true;
		String input;
		double total = 0;

		Scanner scan = new Scanner(System.in);
		
		//get the input
		do {
			try {		
				System.out.print("Enter an integer: ");
				input = scan.nextLine();
				integerArray[index] = Integer.parseInt(input);
				index++;
			}
			catch (NumberFormatException e) {
				System.out.println("Not an integer. Try again.");
			}
			
			if (index > 9){
				stillNeedMoreIntegers = false;
			}
			
		} while (stillNeedMoreIntegers);
		
		scan.close();
		
		// get the average
		for (int i = 0;i < 10; i++) {
			total += integerArray[i];
		}
System.out.println("Average: " + (total / 10));
	}
}
