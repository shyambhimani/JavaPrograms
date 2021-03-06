package assignment3;

public class Employee {
	String firstName;
	String lastName;
	int age;
	double salary;
	
	// Importing Car class and its property----- Aggregation (Has-A relationship)
	Car car;
	
	// Default constructor Employee class 
	public Employee(){
		
	}
	
	// Parameterized constructor 
	public Employee(String firstName, String lastName, int age, double salary, Car carDetail){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		car = carDetail;
		
	}
	
	// Satters
	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setage(int age){
		this.age = age;
	}
	
	public void setsalary(double salary){
		this.salary = salary;
	}
	
	// Getters 
	public String getfirstName(){
		return firstName;
	}
	
	public String getlastName(){
		return lastName;
	}
	
	public int getage(){
		return age;
	}
	
	public double getsalary(){
		return salary;
	}
	
	// This method prints all the employee detail also prints car detail employee has
	void printEmployeeDetail(){
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println(firstName + " has " + car.color + " " + car.model + " it's VIN is " + car.VIN + " and it is make year is " + car.year );
		
	}
	
	public static void main(String[] args){
		
		// Creating c1 object of Car class 
		Car c1 = new Car("Blue", "BMW 5i", " GT796KB007", 2007);
		
		// Creating e1 objetc of Employee class also passing c1 object
		Employee e1 = new Employee("Shyam", "Bhimani", 25, 20000, c1);
		
		// Calling printEmployeeDetail() method using e1 object which prints all details 
		e1.printEmployeeDetail();
		
		
		
		
	}
	
}
