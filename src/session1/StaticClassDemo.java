package session1;

public class StaticClassDemo {

	
	public static int num = 10;
	

	

	
	
	public static void main(String[] args) {
		
		
		StaticClassDemo obj1 = new StaticClassDemo();
		obj1.num = 15;
		System.out.println(obj1.num);
		
		
		StaticClassDemo obj2 = new StaticClassDemo();
		System.out.println(obj2.num);
//		
		StaticClassDemo obj3 = new StaticClassDemo();
		System.out.println(obj3.num);
		
		
		
		
	}
}
