package Day11;
//case 1: without exception object propagation
public class Demo {

	public static void main(String[] args) {//calling method (caller)
		// TODO Auto-generated method stub
		
		m1();//method call staement

	}
	public static void m1() //caller method
	{
		try
		{
			System.out.println(20/0);
		}
	
	catch(ArithmeticException e) //NullPointerException e new ArithmeticException
	{
		System.out.println("Hi");
		
	}
	}
	

}
