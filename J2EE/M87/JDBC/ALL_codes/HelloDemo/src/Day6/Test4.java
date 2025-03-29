package Day6;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hi");
		System.out.println(s1);
		char[] ch = {'r','a','m'};
		
		System.out.println(ch.length);
		
		String s2=new String(ch);
		
		System.out.println(s2);
		
		String s3="hi boss i am boss";
		
		String[] res1=s3.split(" ");//return type of split is string
		
		System.out.println(Arrays.toString(res1));
		

		String[] res2=s3.split("");
		
		System.out.println(Arrays.toString(res2));
	}

}
