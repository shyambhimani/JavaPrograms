package com.apex.java6;

class MyThread extends Thread{
	public void run(){
		System.out.println("Thread!");
		//what the thread wants to do
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread1!");
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		MyThread t2 = new MyThread();
		
		t.start();

		t2.start();
		
		System.out.println(t.isAlive());
		System.out.println(t2.isAlive());
		
	}

}
