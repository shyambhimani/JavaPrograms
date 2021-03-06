package assignment3;

import java.util.Scanner;

public class Car {
	String color;
	String model;
	String VIN;
	int year;

	// Default constructor
	public Car() {

	}

	// Parameterized constructor
	public Car(String color, String model, String VIN, int year) {
		this.color = color;
		this.model = model;
		this.VIN = VIN;
		this.year = year;
	}

	// Exercise 5
	public boolean economyCar(double startMiles, double endMiles, double gasoline) {
		boolean carIsEconomical = false;
		if (startMiles > endMiles) {
			System.out.println("Start mile should be less than end mile");

		} else if (((endMiles - startMiles) / gasoline) > 10) {
			carIsEconomical = true;
		}
		return carIsEconomical;

	}

	public static void main(String[] args) {
		Car car1 = new Car();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting miles: ");
		double startMiles = sc.nextDouble();
		System.out.println("Enter end miles: ");
		double endMiles = sc.nextDouble();
		System.out.println("Enter gasoline used: ");
		double gasoline = sc.nextDouble();
		sc.close();
		System.out.println("Car is Economic: " + car1.economyCar(startMiles, endMiles, gasoline));
	}

}
