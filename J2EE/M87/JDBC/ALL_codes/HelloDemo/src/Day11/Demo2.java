package Day11;

public class Demo2 {
//CASE 2 WITH EXCEPTION OBJECT PROPAGATION
	public static void main(String[] args) {//CALLING METHOD (CALLER)
		// TODO Auto-generated method stub
		try
		{
			m1(); // METHOD CALL STATEMENT
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("hello");
			
		}
	}
	public static void m1() throws ArithmeticException// CALLED METHOD
	{
		System.out.println(20/0);
		
	}

}
