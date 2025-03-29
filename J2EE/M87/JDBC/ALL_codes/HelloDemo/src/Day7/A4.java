package Day7;

public class A4 { // STRING BUFFER IS MUTABLE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("Hello");
		StringBuffer sb2=sb1;
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		sb1.append("world");  // THIS METHOD WILL CHANGE THE BOTH sb1 and sb2 due to string buffer BECAUSE IT CREATE SAME ADDRESS FOR THE 
		// THE SB1 AND SB2
		System.out.println(sb1);
		System.out.println(sb2);
		

	}

}
