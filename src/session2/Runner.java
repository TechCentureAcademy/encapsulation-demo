package session2;

public class Runner {

	public static void main(String[] args) {
		
		
		
		//using all argument constructor to instantiate a customer object
		Customer customer1 = new Customer(1, "jackie", "pass123", "Jack", "Reacher", "Tompson", 45, "1975", "Dentist", 
				"123 Main Str", 1234567L, true, "412-666-0000", "jackie@yahoo.com");
		
		Customer customer2 = new Customer(2, "larry", "pas!21", "Larry", "Reacher", "Tompson", 40, "1970", "QA Analyst", 
				"124 Main Str", 1234568L, false, "412-666-0001", "larry@yahoo.com");
	
		System.out.println(customer1);
		System.out.println(customer2);
		
		
		//using 7-arg constructor to instantiate a customer object
		Customer customer3 = new Customer(3, "bobby", "bob123", "Bob", "Woods", "K", 65);
		
		// using 5-arg constructor
		Customer customer4 = new Customer(4, "lilly", "lilly123", "Lilly", "Spencer");
		
		//using 3-arg
		Customer customer5 = new Customer(5, "kenny", "k123");
		
		
		Customer customer6 = new Customer();
		
		Customer customer7 = new Customer(7);
		

	}
}

//encapsulation
//abstraction
//inheritance
//polymorphism  
//having many forms/shapes

//vehicel object can behave as a truck, as plane, as suv










