package Day9;

import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("welcome");
		
		System.out.println("enter age");
		
		int age=sc.nextInt();
		
		ageVerify(age);
		

	}
	public static void ageVerify(int age)
	{
		if(age<21)
		{
			try
			{
				throw new HaveAPatienceException ();
			
			}
			catch(HaveAPatienceException e) {
				System.out.println("nooo not eligible");
				
			}
		}
		else if(age>60) {
			try {
				throw new OutOfServiceException ();
				
			}
			catch(OutOfServiceException e) {
				System.out.println("better luck");
			}
		
		}
		else {
			System.out.println("congrats");
		}
	}

}
