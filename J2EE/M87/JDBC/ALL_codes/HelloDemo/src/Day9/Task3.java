package Day9;//Case 3: WE ARE GOING TO USE PARENT CONTAINER 

public class Task3 {//case 3 :EXCEPTIONM OCCURS AND HANDLED

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println(25/0);
		}
		catch(Exception e)//exception e=new ArithmeticException();
		{
			System.out.println("hii");//executd
		}
		
		System.out.println("hello");//executed

	}

}
