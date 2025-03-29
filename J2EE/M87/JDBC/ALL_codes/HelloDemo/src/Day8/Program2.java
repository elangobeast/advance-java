package Day8;

public class Program2 {
//    2.StringIndexOutOfBoundException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(62));//	    2.StringIndexOutOfBoundException
	}

}
