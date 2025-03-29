package AdvancJavaAJ_20_3_25;

public class sliding {

	
		// TODO Auto-generated method stub
	    
		int m1() {
			return 10;
			
		}
		static String m2() {
			return "hello ";
		}
		char m3() {
			return 'A';
		}
		boolean m4() {
			return true;
			
		}
		int m5() {
			return 'A';
		}
		public static void main(String[] args) {
			sliding d = new sliding();
			
			int i = d.m1();
			String s= sliding.m2();
			char c=d.m3();
			boolean b = d.m4();
			int num = d.m5(); //A
			//char ch = (char)  num;
			char ch= (char) d.m5();
			System.out.println(i);
			System.out.println(s);
			System.out.println(c);
			System.out.println(b);
			System.out.println(ch);
			
		}

}
