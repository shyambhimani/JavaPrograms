/* Exercise 3:
Your university asked you to develop a java application to calculate the average of the student's performance. 
Create 6 int variables sub1,sub2,...sub6. give some values to subjects and find the total marks and average of the student
output: display both the total marks and average of the student.
*/




package apexDay2;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize and 6 assign subjects variables 
		int sub1, sub2, sub3, sub4, sub5, sub6;
		sub1 = 90;
		sub2 = 95;
		sub3 = 88;
		sub4 = 67;
		sub5 = 100;
		sub6 = 75;
		
		//Print Total marks as in total of 6 variables
		System.out.println("Your total marks : " + (sub1+sub2+sub3+sub4+sub5+sub6) );
		
		//Print average marks as total/6
		System.out.println("your average marks : " + (sub1+sub2+sub3+sub4+sub5+sub6)/6);

	}

}