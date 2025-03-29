package Feb15;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		long factorial=1;
		for (int i=2;i<=num;i++) {
			factorial*=i;
		}
           System.out.println("Factorial Of  " + num +  "  is  " + factorial);
	}

}
