package Day5;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="vadapalani";
		
		System.out.println(s1.contains("vada"));
		System.out.println(s1.contains("idly"));//there are 63 methods in java and contains is one of this
		
		String s2="                                                      I love india";//remove the front space from the string
		
		System.out.println("=== before using trim() method===");
		System.out.println(s2);
		
		System.out.println("=== after using trim() method===");
		System.out.println(s2.trim());
		
		String s3="ram";
		
		System.out.println(s3.length());
		

	}

}
