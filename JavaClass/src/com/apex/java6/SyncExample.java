package com.apex.java6;

class First{
	public void display(String str){
		System.out.print("["+str);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {		}
		System.out.print("]");
	}
}

class Second extends Thread{
	String str;
	First fobj;
	
	Second(String str, First f){
		this.str = str;
		fobj = f;
		start();
	}
	
	
	public void run(){
		synchronized(fobj){	
		fobj.display(str);
		}
	}

}

public class SyncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First f = new First();
		Second s = new Second("Hello", f);
		Second s2 = new Second("World", f);
		Second s3 = new Second("Again", f);
	}

}
