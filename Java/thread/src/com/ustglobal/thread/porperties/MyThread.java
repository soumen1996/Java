package com.ustglobal.thread.porperties;

public class MyThread extends Thread {

	public static void main(String[] args) {
		System.out.println("Main STarted");
		String tname = Thread.currentThread().getName();
		System.out.println("Current Thread "+tname);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("MyThread name "+mname);
		
		Thread.currentThread().setName("Bala");
		
		t1.setName("Golu");
		System.out.println("MyThread Name "+t1.getName());
		
		System.out.println(10/0);
		System.out.println("Main Ended");
	}
}
