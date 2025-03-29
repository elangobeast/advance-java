package Day5;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sheela";
		String s2="Sheela";
		String s3=new String("Sheela");
		 
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
//using new keyword one block of memory created inside the heap area 
	}

}
