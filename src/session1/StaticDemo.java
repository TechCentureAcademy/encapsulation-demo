package session1;

public class StaticDemo {

	
	public static void main(String[] args) {
		
		
		Math.max(12324, 344+65);
		
		
		
//		MathOperations_Static staticc = new MathOperations_Static();
//		staticc.add(1, 2);
		
		
		// In order to invode static methods, we can call them
		//directly from their class names
		MathOperations_Static.add(200, 55);
		MathOperations_Static.substract(300, 22);
		
		
		//In order to use a non-static methods from a class,
		//we need to instantiate (create objects) and object of that class
		//and call those methods from the object reference
		

		MathOperations_NonStatic nonStatic = new MathOperations_NonStatic();
		
		nonStatic.add(11,22);
		nonStatic.substract(133,22);
		
		
		
	}
	
}
