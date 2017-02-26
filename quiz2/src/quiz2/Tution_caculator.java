package quiz2;

import java.util.Scanner;

public class Tution_caculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double total_tuition = 0;
		
		System.out.println("Enter the first year tution rate: ");
		double tuition = input.nextDouble();
		
		System.out.println("Enter the percentage increase of each year: (between 3 to 5)");
		double Pincrease = input.nextDouble();
		
		for(int i =0; i<4; i++){
			tuition = tuition + tuition * (Pincrease / 100);
			total_tuition += tuition;
			}
		System.out.printf("Your four years tuition will be %.2f", total_tuition);
		System.out.println(" dollors, when each year increase percentage is " + Pincrease + "%");
	}      
}