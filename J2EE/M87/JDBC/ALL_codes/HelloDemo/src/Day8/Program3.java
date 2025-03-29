package Day8;//  2.null pointer exception

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=null;
		String s2="hi";
		
		
		System.out.println(s1.charAt(2));//2.null pointer exception
		System.out.println(s2.charAt(1));//2.null pointer exception because exception is not 
		                                             //handled for the before null  exception
	}

}
