package session1;

public class ATIM {

	
	public void withDraw(double amount) {
		validateAmount(amount);
		checkBalance();
		verifyCustomer();
		
	}
	
	private boolean validateAmount(double amount) {
		return true;
	}
	
	private void checkBalance() {
		//if amount <= balance then allow withdraw
	}
	
	private void verifyCustomer() {
		verifyPin();
	}
	
	private void verifyPin() {
		
	}
	
	public void deposit() {
		
	}
	
	public void seeBalance() {
		
	}
}
