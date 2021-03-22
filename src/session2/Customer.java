package session2;

public class Customer {

	private int id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String middleName;
	private int age;
	private String dob;
	private String occupation;
	private String address;
	private long ssn;
	private boolean hasDriverLicense;
	private String phoneNumber;
	private String email;

	//below are 6 overloaded constructors
	
	public Customer() {
		this.id = -1;
		this.occupation = "unknown";
		this.userName = "unknown";
		this.password = "undefined";
	}
	
	//1 arg constructor
	public Customer(int id) {
		this(id, "","");
	}
	
	// 3 arg constructor
	public Customer(int id, String userName, String password) {
		this(id, userName, password, "","");
	}
	
	//5 arg constructor
	public Customer(int id, String userName, String password, String firstName, 
			String lastName) {
		this(id, userName, password, firstName, lastName, "",-1);
	}
	
	//7 arg constructor that uses all args consctor internally to initialize its 7 fields
	public Customer(int id, String userName, String password, String firstName, 
			String lastName, String middleName, int age) {
		this(id, userName, password, firstName, lastName, middleName, age, "", "", "", 0, false, "", "");
	}

	//all arg constructor: 14 args
	public Customer(int id, String userName, String password, String firstName, String lastName, String middleName,
			int age, String dob, String occupation, String address, long ssn, boolean hasDriverLicense,
			String phoneNumber, String email) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.age = age;
		this.dob = dob;
		this.occupation = occupation;
		this.address = address;
		this.ssn = ssn;
		this.hasDriverLicense = hasDriverLicense;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getSsn() {
		return ssn;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
	}

	public boolean isHasDriverLicense() {
		return hasDriverLicense;
	}

	public void setHasDriverLicense(boolean hasDriverLicense) {
		this.hasDriverLicense = hasDriverLicense;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", age=" + age + ", dob=" + dob + ", occupation=" + occupation
				+ ", address=" + address + ", hasDriverLicense=" + hasDriverLicense + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}

	//we need to override toString method


	
	
	/**
	 * Explain what this method does shortly
	 *  
	 * @param url - explain what this parameter is
	 * @param n1 - explain what this parameter is
	 * @param str - explain what this parameter is
	 */
	public void someComplexMethod(String url, int n1, String[] str) {
		//the logic
	}

	
	
	
	
	
	
	
}
