package assignments14_OOP;

public class Calculator {
	
			/*Question-10
		
		A static method can be used without instantiating a class object. 
		Like in the calculator class create a plus and minus. 
		but this time make them static methods.
		plus: gets two ints and returns the addition of the to numbers as an int   
		minus:the same as plus its also static, but it returns the substructed value 
		of the two ints it gets
		
		calc.minus(1,1)
		returns:0
		
		calc.plus(10,1)
		returns:11
		*/

		public static int plus(int a, int b) {
			
			return a+b;
		}
		
		public static int minus(int a, int b) {
			
			return a-b;
		}
}
