package com.apex.java6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "123-456-7890";
		String REGEX = "^(\\d{3}?-\\d{3}?-\\d{4})$";
		
		Pattern p = Pattern.compile(REGEX);
		
		Matcher m = p.matcher(str);
		
		if(m.find()){
			System.out.println("SSN Found!");
		}
		
		else{
			System.out.println("Bad SSN!");
		}
		

	}

}