package Day7;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("Ram");
		StringBuffer sb2=new StringBuffer("ram");
		StringBuffer sb3=sb1;
		StringBuffer sb4=new StringBuffer("rṇam");
		
		System.out.println(sb1==sb3);// 0x1==0x1
		System.out.println(sb1.equals(sb3));// 0x1== 0x1
		
		System.out.println(sb2==sb4);
		System.out.println(sb2.equals(sb4));

	}

}
