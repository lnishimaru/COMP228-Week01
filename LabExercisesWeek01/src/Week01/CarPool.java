package Week01;

import java.util.Scanner;

public class CarPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double miles;
		double cost;
		double average;
		double parking;
		double toll;
		double totalCost = 0;
		// Input variables 
				System.out.println("Enter the Total Miles driven: ");
				Scanner input = new Scanner(System.in);
				miles = input.nextDouble();
				System.out.println("Enter the Cost per Galon: ");
				cost = input.nextDouble();
				System.out.println("Enter the Average Miles per Galon: ");
				average = input.nextDouble();
				System.out.println("Enter the Parking Fees: ");
				parking = input.nextDouble();
				System.out.println("Enter the Toll Cost per Day: ");
				toll = input.nextDouble();
				
				//Calculating the cost  
				totalCost = (miles / average * cost) + parking + toll;
				System.out.printf("Total Cost:%.2f", totalCost);
	}

}
