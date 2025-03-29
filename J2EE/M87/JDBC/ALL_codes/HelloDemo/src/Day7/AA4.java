package Day7;

public class AA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("raja");
		
		System.out.println(sb1.reverse());
		
		StringBuffer sb2=new StringBuffer("RANI");
		
		System.out.println(sb2);
		
		sb1.insert( 1, "sql");
		
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer("vijay");
		
		sb3.deleteCharAt(0);
		
		System.out.println(sb3);
		
		StringBuffer sb4= new StringBuffer("ShambhuTabrezSheela");
		
		sb4.delete(7,13);
		
		System.out.println(sb4);

	}

}
