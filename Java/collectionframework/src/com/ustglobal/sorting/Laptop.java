package com.ustglobal.sorting;

public class Laptop implements Comparable<Laptop>{
	
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
	public int compareTo(Laptop l) {
		if(this.ram>l.ram) {
			
			return 1;
			
		}else if( this.ram<l.ram) {
			return -1;
		}else {
			return 0;
		}

	}
	
	
	
	
	
	

}
