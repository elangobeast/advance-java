package Day9;

public class Tak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(25/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(("hi"));
		}
		System.out.println("hello");

	}

}
