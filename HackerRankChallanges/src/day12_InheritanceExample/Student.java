/**
 * Copyright 2016 Shyam Bhimani
 */
package day12_InheritanceExample;

import java.util.Scanner;

class Student extends Person{
    
    private int[] testScores;
    int Score = 0;
    char grade = 'F';
    
    // Constructor
    public Student( String fName, String lName, int id, int test[]){
    	super(fName, lName, id);
    	this.testScores = test;
    		
    		
    	}
    
    
    // Calculate method which calculates grade 
    public char calculate(){
        
        for (int i = 0; i < testScores.length; i++){
            Score += testScores[i]; 
            
        }
        
       int avg = Score/testScores.length;
        
        if (avg <= 100 && avg >= 90){
            grade = 'O';
        }else{
            if (avg < 90 && avg >= 80){
                grade = 'E';
            }else{
                if (avg < 80 && avg >= 70){
                    grade = 'A';
                }else{
                    if(avg < 70 && avg >= 55){
                        grade = 'P';
                    }else{
                        if (avg < 55 && avg >= 40){
                            grade = 'D';
                        }else{
                            if (avg < 40){
                                grade = 'T';
                            }
                        }
                    }
                }
            }
        }
        
        return grade;        
        
    }
    
    
	
   

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	

	}

}
