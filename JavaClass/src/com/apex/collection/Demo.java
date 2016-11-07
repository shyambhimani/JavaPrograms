package com.apex.collection;


class employee{
	String name;
	employee(String n){
		name = n;
	}
	public String toString(){
		return name;
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee e = new employee("John");
		employee e2 = new employee("John");
		System.out.println(e);
		System.out.println(e2);
		
	}

}
