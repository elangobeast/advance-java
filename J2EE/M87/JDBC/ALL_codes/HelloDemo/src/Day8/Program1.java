package Day8;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main start");
		
		try
		{
			System.out.println(10/0); //abnormal statement		
			
		}
		
		catch(ArithmeticException e)//e is a refernce variable //Throwback-->exceptin-->runtime exception --> 1.aritmetic expression
		{                                                                      //  2.class cast exception
			System.out.println("dont divide the number by zero");              //  3.null pointer exception
			System.out.println(e);                              									   //  4.IndexOutofBoundException
		}																		// 		1.ArrayIndexOutOfBoundException
																				//	    2.StringIndexOutOfBoundException
		System.out.println("main end");
		

	}

}
