package com.perscholas.cafe;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Product coffee = new Product("Coffee", 2.75, "Hot and delicious");
		Product espresso = new Product("Espresso", 4.80, "Aromatic and packs a punch");
		Product cappuccino = new Product("Cappuccino", 5.45, "Smooth and creamy; Warms the soul");

		Scanner scan = new Scanner(System.in);

		System.out.println("How many coffees do you want?");
		int coffeeQty = scan.nextInt();
		double coffeeSubtotal = coffee.calculateProductTotal(coffeeQty);
		System.out.printf("Product name: %s\nDescription: %s.\nSubtotal: $%.2f\n\n", coffee.getName(),
				coffee.getDescription(), coffeeSubtotal);

		System.out.println("How many espressos do you want?");
		int espressoQty = scan.nextInt();
		double espressoSubtotal = espresso.calculateProductTotal(espressoQty);
		System.out.printf("Product name: %s\nDescription: %s.\nSubtotal: $%.2f\n\n", espresso.getName(),
				espresso.getDescription(), espressoSubtotal);

		System.out.println("How many cappuccinos do you want?");
		int cappuccinoQty = scan.nextInt();
		double cappuccinoSubtotal = cappuccino.calculateProductTotal(cappuccinoQty);
		System.out.printf("Product name: %s\nDescription: %s.\nSubtotal: $%.2f\n\n", cappuccino.getName(),
				cappuccino.getDescription(), cappuccinoSubtotal);

		double orderSubtotal = coffeeSubtotal + espressoSubtotal + cappuccinoSubtotal;
		double salesTax = .0625 * orderSubtotal;
		double orderTotal = orderSubtotal + salesTax;

		System.out.printf("Your order subtotal is: $%.2f\nSales tax is $%.2f\nOrder Total is: $%.2f", orderSubtotal,
				salesTax, orderTotal);

		scan.close();
	}

}
