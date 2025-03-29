package Day9;//When do we say exception is handled?

public class Tas1 {//case 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(25/5);
			System.out.println(10/0);
			
		}
		catch(NullPointerException e) //NullPointerException e new ArithmeticException
		{
			System.out.println("Hi");
			
		}
		System.out.println("hello");

	}

}
