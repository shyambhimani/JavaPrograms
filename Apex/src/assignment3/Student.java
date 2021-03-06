package assignment3;

import java.util.Scanner;

public class Student {

	double sub1;
	double sub2;
	double sub3;
	double sub4;
	double sub5;
	double sub6;

	// Parameterized constructor
	public Student(double java, double database, double hadoop, double python, double javascript, double html) {
		sub1 = java;
		sub2 = database;
		sub3 = hadoop;
		sub4 = python;
		sub5 = javascript;
		sub6 = html;

	}

	// Default constructor
	public Student() {

	}

	// Setters
	public void setsub1(double sub1) {
		this.sub1 = sub1;
	}

	public void setsub2(double sub2) {
		this.sub2 = sub2;
	}

	public void setsub3(double sub3) {
		this.sub3 = sub3;
	}

	public void setsub4(double sub4) {
		this.sub4 = sub4;
	}

	public void setsub5(double sub5) {
		this.sub5 = sub5;
	}

	public void setsub6(double sub6) {
		this.sub6 = sub6;
	}

	// Getters
	public double getsub1() {
		return sub1;
	}

	public double getsub2() {
		return sub2;
	}

	public double getsub3() {
		return sub3;
	}

	public double getsub4() {
		return sub4;
	}

	public double getsub5() {
		return sub5;
	}

	public double getsub6() {
		return sub6;
	}

	// Method to find total marks and average marks
	public double total(double java, double database, double hadoop, double python, double javascript, double html) {
		double total = java + database + hadoop + python + javascript + html;
		return total;
	}

	public double averageMarks() {
		double total = total(sub1, sub2, sub3, sub4, sub5, sub6);
		double averageMarks = total / 6;
		return averageMarks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// created Student object as student1
		Student student1 = new Student();
		System.out.println("Enter marks of Java: ");
		double java = sc.nextDouble(); // Getting java marks from user
		student1.sub1 = java; // Passing java marks in sub1
		System.out.println("Enter marks of Database: ");
		double database = sc.nextDouble(); // Getting Database marks from user
		student1.sub2 = database; // Passing Database marks in sub2
		System.out.println("Enter marks of Hadoop: ");
		double hadoop = sc.nextDouble(); // Getting Hadoop marks from user
		student1.setsub3(hadoop); // Passing Hadoop marks in sub3 using setter method
		System.out.println("Enter marks of Python: ");
		double python = sc.nextDouble(); // Getting Python marks from user
		student1.setsub4(python); // Passing Python marks in sub4 using setter
		System.out.println("Enter marks of JavaScript: ");
		double javascript = sc.nextDouble();// Getting JavaScript marks from user
		student1.sub5 = javascript; // Passing JavaScript marks in sub5
		System.out.println("Enter marks of HTML: ");
		double html = sc.nextDouble(); // Getting HTML marks from user
		student1.sub6 = html; // Passing HTML marks in sub6
		sc.close();

		System.out.println("Total marks: " + student1.total(java, database, hadoop, python, javascript, html));
		System.out.println("Average marks: " + student1.averageMarks());

	}

}
