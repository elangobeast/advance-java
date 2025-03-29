package Day5;//object creation with the help of using keyword in string

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("Hello");
		String s2=new String("HELLO");
		String s3=s1;
		String s4=new String("HELLO");// five objects are created inside the heap area
		//inside the String constant pool there are two objects
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4));
		
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));//true

	}

}
