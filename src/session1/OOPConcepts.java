package session1;

import java.util.Scanner;

public class OOPConcepts {

	
	/* 
	 * 
	 * In Java and other programming languages, we have 4 OOP (Object Oriented Programming) principles:
	 * 
	 * 1. Encapsulation - hiding class properties and methods. We can private access modifies to hide those class members
	 * 2. Inheritance - classes being able to inherit some properties and methods from other classes
	 * 3. Abstraction - abstracting out the inner details of our application
	 * 4. Polymorphism - objects being able to take different forms. 
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		
		//primitive variables
		//primitive variables are stored in stack memory
		//they are easier to access.
		
		int n = 12;
		double d = 6.78;
		char c = 'c';
		long l = 9L;
		
		
		//reference variables, because these 
		//ref variables are pointing to obects in the 
		//heap memory
		Car car1 = new Car();
		car1.make = "Honda";
		car1.model = "Civic";
		car1.numberOfSeats = 5;
		
		new Car();
		new Car();
		new Car();
		new Car();
		new Car();
		new Car();
		new Car();
		new Car();
		new Car();
		
		Car car2 = new Car();
		car2.make = "Toyota";
		car2.model = "Sienna";
		car2.numberOfSeats = 8;
		
		car2.model = "rav4";
		car2.numberOfSeats = 6;
		
		Car car3 = car2;
		
		car3.make = "Hyundai";
		car3.model = "Sonata";
		car3.numberOfSeats = 5;
		
		Car car4 = car3;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
