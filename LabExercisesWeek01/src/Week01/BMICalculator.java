package Week01;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Underweight = <18.5
         * Normal weight = 18.5�24.9
         * Overweight = 25�29.9
         * Obesity = BMI of 30 or greater
		 */

		double weight;
		double height;
		double bmi = 0;
		
		// Input variables 
				System.out.println("Enter your Height (m): ");
				Scanner input = new Scanner(System.in);
				height = input.nextDouble();
				System.out.println("Enter your Weight (kg): ");
				weight = input.nextDouble();
				bmi = weight / (height * height);
				System.out.printf("Your BMI is: %.3f", bmi);
				if (bmi >= 30)
				{
					System.out.printf("%s", " - Obesity");
				} else if (bmi >= 25)
				{
					System.out.printf("%s", " - Overweight");
					
				} else if (bmi >= 18.5)
				{
					System.out.printf("%s", " - Normal");
				} else {
					System.out.printf("%s", " - Underweight");
				}
	}

}
