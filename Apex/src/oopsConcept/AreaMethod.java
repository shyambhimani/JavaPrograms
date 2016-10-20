package oopsConcept;

import java.util.*;

public class AreaMethod {

	static double pi = 3.14;
	double radious;
	double width;
	double length;

//	public AreaMethod(){
//		
//	}
	
	//Method to calculate Area of Circle
	public void areaOfCircle() {
		double area = pi * (radious * radious);
		System.out.println("Area of the Circle is: " + area);
	}

	//Method to calculate Area of Square
	public void areaOfSquare() {
		double area = radious * radious;
		System.out.println("Area of the Square is: " + area);
	}
	
	//Method to calculate Area of Rectangle 
	public void areaOfRectangle() {
		double area = width * length;
		System.out.println("Area of the Rectangle is: " + area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaMethod area = new AreaMethod();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please select the option below");
		System.out.println("Enter 1 to find the Area of Circle");
		System.out.println("Enter 2 to find the Area of Square");
		System.out.println("Enter 3 to find the Area of Rectangle");
		int option = sc.nextInt();

		//User will choose one option and below case will be executed according
		switch (option) {
		case 1:
			System.out.println("You have selected 1 to find Area of Circle");
			System.out.println("Please enter Radious of Circle" );
			area.radious = sc.nextDouble();
			option = 1;
			area.areaOfCircle();
			break;

		case 2:
			System.out.println("You have selected 2 to find Area of Square");
			System.out.println("Please enter length of side: " );
			area.radious = sc.nextDouble();
			option = 2;
			area.areaOfSquare();
			break;

		case 3:
			System.out.println("You have selected 3 to find Area of Rectangle");
			System.out.println("Please enter length: " );
			area.length = sc.nextDouble();
			System.out.println("Please enter Width: ");
			area.width = sc.nextDouble();
			option = 3;
			area.areaOfRectangle();
			break;

		default:
			System.out.println("Ops! You have entred invalid input :( ");

		}


		sc.close();
	}

}
