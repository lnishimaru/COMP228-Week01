package Week01;

import java.util.Scanner;

public class PopulationGrowth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double initial = 7.7 ;
		int years;
		double rate = 1.14;
		double population = 0;
		System.out.println("Enter the amount of years: ");
		Scanner input = new Scanner(System.in);
		years = input.nextInt();
		population = initial + (years * rate / 100);
		System.out.printf("%s%d%s%.2f%s", "In ",years," years, the world population will be ",population," billion people");
	}
}
