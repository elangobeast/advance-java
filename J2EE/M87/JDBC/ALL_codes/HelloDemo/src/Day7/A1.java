package Day7;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer();
		
		System.out.println("capacity:  " +sb1.capacity());//16
		System.out.println("length of the string bugger:  " +sb1.length());//10
		
		sb1.append("hello");
		sb1.append("how");
		
		System.out.println(sb1.capacity());//15
		System.out.println(sb1.length());
		
		sb1.append("are");
		sb1.append("you");
		sb1.append("ooo");
		
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		sb1.append("am");
		
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		

	}

}
