package oopsConcept;

import java.util.*;

public class JobApplication {

	static String companyName = "Ebay";
	String firstName;
	String lastName;
	int age;
	String gender;
	private String presentAddress;
	private String telephonNumber;
	private String ssn;
	double expectedSalaryPerMonth;

	public JobApplication() {

	}

	public void setFirstName(String FirstName) {
		firstName = FirstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String LastName) {
		lastName = LastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(int Age) {
		age = Age;
	}

	public int getAge() {
		return age;
	}

	public void setGender(String Gender) {
		gender = Gender;
	}

	public String getGender() {
		return gender;
	}

	public void setPresentAddress(String PresentAddress) {
		presentAddress = PresentAddress;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setTelephoneNumber(String TelephonNumber) {
		telephonNumber = TelephonNumber;
	}

	public String getTelephonNumber() {
		return telephonNumber;
	}

	public void setSsn(String Ssn) {
		ssn = Ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setExpectedSalaryPerMonth(double ExpectedSalaryPerMonth) {
		expectedSalaryPerMonth = ExpectedSalaryPerMonth;
	}

	public double getExpectedSalaryPerMonth() {
		return expectedSalaryPerMonth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JobApplication application1 = new JobApplication();

		// Scanner class to get input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to " + JobApplication.companyName + " job application page");
		
		System.out.println("Please enter your First Name: ");
		application1.setFirstName(application1.firstName = sc.nextLine());
		
		System.out.println("Please enter your Last Name: ");
		application1.setLastName(application1.lastName = sc.nextLine());
		
		System.out.println("Please enter your Age in Years: ");
		application1.setAge(application1.age = sc.nextInt());
		
		System.out.println("Please enter your Gender: ");
		application1.setGender(application1.gender = sc.nextLine());
		
		System.out.println("Please enter your current Address: ");
		application1.setPresentAddress(application1.presentAddress = sc.nextLine());
		
		System.out.println("Please enter your phone number: ");
		application1.setTelephoneNumber(application1.telephonNumber = sc.nextLine());
		
		System.out.println("Please enter your Social Security Number: ");
		application1.setSsn(application1.ssn = sc.nextLine());
		
		System.out.println("Please enter your Salary Expectation");
		application1.setExpectedSalaryPerMonth(application1.expectedSalaryPerMonth = sc.nextDouble());
		
		sc.close();

		// We will preview all the data entered by user

		System.out.println("==========================Preview of your application=========================");
		System.out.println("You are applying for job @ " + JobApplication.companyName);
		System.out.println("Your First Name: " + application1.getFirstName());
		System.out.println("Your Last name: " + application1.lastName);
		System.out.println("Your age: " + application1.getAge());
		System.out.println("Your gender: " + application1.getGender());
		System.out.println("Your current address: " + application1.getPresentAddress());
		System.out.println("Your phone number: " + application1.getTelephonNumber());
		System.out.println("Your Social Security Number: " + application1.getSsn());
		System.out.println("You have entered expected Salary: " + application1.getExpectedSalaryPerMonth());

	}

}
