package com.apex.collection;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Studentinfo implements Serializable 
{
	String name;
	int rid;
	static String contact;
	Studentinfo(String n, int r, String c)
	{
		this.name = n;
		this.rid = r;
		this.contact = c;
	}
}

class Test
{
	public static void main(String[] args) {
		try {
			Studentinfo si = new Studentinfo("Abhi", 104, "110044");
			FileOutputStream fos = new FileOutputStream("d:/student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(si);
			
			
			oos.close();
			fos.close();
	  	} catch (Exception e) {
	  		e. printStackTrace(); 
	  	}
	}
}
