package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("What is the price of the item? ");
		 Double cost = scan.nextDouble();
		 cost = cost * 100;
		 
		System.out.println("How much money is given by customer?");
		Double given = scan.nextDouble();
		given = given * 100;
		
		if (given< cost ) {
			System.out.println("Insuffient funds. Where is my money?!!!");	
			}
		
		else if (given == cost) {
			System.out.println("Perfect, exact amount");
			}
			
		else if (given > cost) {
				int change = (int)((given - cost));
				int penny, nickel, dime, quarter, one, five, ten, twenty = 0;
				
				if (true) {
					
					
					twenty = change / 2000;
					System.out.println("Give customer, " + twenty + ", $20 bills");
					change = change % 2000;
					
					ten = change / 1000;
					System.out.println("Give customer, " + ten + ", $10 bills");
					change = change % 1000;
					
					five = change / 500;
					System.out.println("Give customer, " + five + ", $5 bills");
					change = change % 500;
					
					one = change / 100;
					System.out.println("Give customer, " + one + ", $1 bills");
					change = change % 100;
					
					quarter = change / 25;
					System.out.println("Give customer, " + quarter + ", quarters");
					change = change % 25;
					
					dime = change / 10;
					System.out.println("Give customer, " + dime + ", dimes");
					change = change % 10;
					
					nickel = change / 5;
					System.out.println("Give customer, " + nickel + ", nickels");
					change = change % 5;
					
					penny = change / 1;
					System.out.println("Give customer, " + penny + ", pennies");
					
				
				}
		} 
		  
		
	}
}			
