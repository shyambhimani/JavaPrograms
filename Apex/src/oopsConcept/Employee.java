package oopsConcept;

public class Employee {

	int empNo;
	String empName;
	String address;
	String state;
	int zipCode;
	String phone;
	String designation;
	int experienceInYears;
	String emailAddress;
	double basic;
	double hra;
	double bonus;

	// Default Constructor
	public Employee() {

	}

	// Setter for empNo
	public void setEmpNo(int employeeNumber) {
		empNo = employeeNumber;

	}

	// Getter for emoNo
	public int getEmpNo() {
		return empNo;
	}

	// Setter for empName
	public void setEmpName(String employeeName) {
		empName = employeeName;
	}

	// Getter for empName
	public String getEmpName() {
		return empName;
	}

	// Setter for address
	public void setAddress(String Address) {
		address = Address;
	}

	// Getter for address
	public String getAddress() {
		return address;
	}

	// Setter for state
	public void setState(String State) {
		state = State;
	}

	// Getter for state
	public String getState() {
		return state;
	}

	// Setter for zipCode
	public void setZipCode(int ZipCode) {
		zipCode = ZipCode;
	}

	// Getter for zipCode
	public int getZipCode() {
		return zipCode;
	}

	// Setter for phone
	public void setPhone(String Phone) {
		phone = Phone;
	}

	// Getter for phone
	public String getPhone() {
		return phone;
	}

	// Setter for designation
	public void setDesignation(String Designation) {
		designation = Designation;
	}

	// Getter for designation
	public String getDesignation() {
		return designation;
	}

	// Setter for experienceInYear
	public void setExperienceInYears(int ExperienceInYears) {
		experienceInYears = ExperienceInYears;
	}

	// Getter for experienceInYear
	public int getExperienceInYears() {
		return experienceInYears;
	}

	// Setter for emailAddress
	public void setEmailAddress(String EmailAddress) {
		emailAddress = EmailAddress;
	}

	// Getter for emailAddress
	public String getEmailAddress() {
		return emailAddress;
	}

	// Setter for basic
	public void setBasic(double Basic) {
		basic = Basic;
	}

	// Getter for basic
	public double getBasic() {
		return basic;
	}

	// Setter for hra
	public void setHra(double Hra) {
		hra = Hra;
	}

	// Getter for hra
	public double getHra() {
		return hra;
	}

	// Setter for bonus
	public void setBonus(double Bonus) {
		bonus = Bonus;
	}

	// Getter for bonus
	public double getBonus() {
		return bonus;
	}

	// Method totalSalary() to count total Salary of employee after bonus and hra
	public double totalSalary() {
		double salary = (basic + hra + (bonus / 100) * basic);

		return salary;
	}

	// Main method where we going to create objects and pass value
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating emp1 object of class Employee
		Employee emp1 = new Employee();

		// Initializing all the instance of class Employee
		emp1.empNo = 001;
		emp1.empName = "Shyam Bhimani";
		emp1.address = "47112-Warm Springs Blvd";
		emp1.state = "California";
		emp1.zipCode = 94539;
		emp1.phone = "817-323-0632";
		emp1.designation = "Manager";
		emp1.experienceInYears = 8;
		emp1.emailAddress = "shyambhimani@gmail.com";
		emp1.basic = 8045.84;
		emp1.hra = 545.47;
		emp1.bonus = 20;

		System.out.println("Employee Number: " + emp1.empNo + " \nEmployee Name: " + emp1.empName + "\nAddress: "
				+ emp1.address + "\nState: " + emp1.state + "\nZip Code: " + emp1.zipCode + "\nPhone Number: "
				+ emp1.phone + "\nDesignation: " + emp1.designation + "\nExperience In Years: " + emp1.experienceInYears
				+ "\nEmail Address: " + emp1.emailAddress + "\nBasic Salary: " + emp1.basic + "\nHRA: " + emp1.hra
				+ "\nBonus Percentages: " + emp1.bonus + "\n ====================================\nFinal Salary : "
				+ emp1.totalSalary());
		
		System.out.println("\n==X==X==X==X==X==X==X==X==End of Example 1 X==X==X==X==X==X==X==X");

		Employee emp2 = new Employee();

		// Initializing all the instance of class Employee using Setter method
		// (Encapsulation)
		emp2.setEmpNo(2);
		emp2.setEmpName("John Campbell");
		emp2.setAddress("5847 Grimmer Blvd");
		emp2.setState("CA");
		emp2.setZipCode(58476);
		emp2.setPhone("987-542-6584");
		emp2.setDesignation("Supervisor");
		emp2.setExperienceInYears(12);
		emp2.setEmailAddress("john_campbell@gmail.com");
		emp2.setBasic(5479.00);
		emp2.setHra(874.25);
		emp2.setBonus(30);

		System.out.println(
				"\n \nThis is example using Setter and Getter method\n================================================ \n");

		System.out.println("Employee Number: " + emp2.getEmpNo() + " \nEmployee Name: " + emp2.getEmpName()
				+ "\nAddress: " + emp2.getAddress() + "\nState: " + emp2.getState() + "\nZip Code" + emp2.getZipCode()
				+ "\nPhone Number: " + emp2.getPhone() + "\nDesignation: " + emp2.getDesignation()
				+ "\nExperience In Years: " + emp2.getExperienceInYears() + "\nEmail Address: " + emp2.getEmailAddress()
				+ "\nBasic Salary: " + emp2.getBasic() + "\nHRA: " + emp2.getHra() + "\nBonus Percentages: "
				+ emp2.getBonus() + "\n====================================\nFinal Salary : " + emp2.totalSalary());

	}

}