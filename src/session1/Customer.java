package session1;

public class Customer {

	//final properties example
	
	//we are encapsulating first and last name;
	private String firstName;
	private String lastName;
	private final int id;
	
	
	//the only way we can access firstName and lastName, is inside this class
	
	//   no-arg constructor
	public Customer() {
		System.out.println("empty constructor called");
		this.id = -1;
	}
	
	//                      Joe                Ken
	public Customer(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		boolean valid = validateName(firstName);
		
		if(valid) {
			this.firstName = firstName;
		}else {
			System.out.println("Name cannot be null or empty!");
		}
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return this.id;
	}
	
	private boolean validateName(String name) {
		if (name != null && !name.isEmpty()) {
			return true;
		}
		return false;
	}
	
	
	
	
}
