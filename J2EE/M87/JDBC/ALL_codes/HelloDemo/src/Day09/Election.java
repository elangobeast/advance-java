package Day09;

import java.util.Scanner;

import Day09.NotAMajorException;

public class Election {

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
				throw new NotAMajorException ();
			
			}
			catch(NotAMajorException e) {
				System.out.println("nooo not eligible");
				
			}
		}
		else
		{
			System.out.println("congrats");
		}

	}

}
