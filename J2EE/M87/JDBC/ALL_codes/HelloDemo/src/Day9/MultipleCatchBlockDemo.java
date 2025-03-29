package Day9;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
			int a[]= {1,2,3,4,5};
			System.out.println(a[5]);
			
		}
		catch(NullPointerException e)
		{
			System.out.println("ramesh");
			
		}
		catch(ClassCastException e)
		{
			System.out.println("Suresh");
		}
		catch(ArithmeticException e)
		{
					System.out.println("Naresh");
		}
		catch(Exception e)
		{
			System.out.println("Mahesh");
		}
		//catch(ArithmeticException e)
		//{
		//	System.out.println("suresh");
		//}

	}

}
