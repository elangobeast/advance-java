package Day5;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hello");
		String s2=new String ("Hello");
		
		String s3=("Hello");
		String s4=("Hello");
		
		System.out.println(s1==s2);//check the address
		System.out.println(s1.equals(s2));//check the elements
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));

	}

}
