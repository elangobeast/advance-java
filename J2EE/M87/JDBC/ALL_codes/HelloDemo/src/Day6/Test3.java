package Day6;//Immutable examples

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		String s2="Coding";
		String s3=s1.concat(s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);//3 objects are created and its reduce the perfomance

	}

}
