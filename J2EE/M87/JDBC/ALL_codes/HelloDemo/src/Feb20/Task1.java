package Feb20;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task1 {

	public static void main(String[] args) {
		ArrayList <Integer> al= new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		
		//3 way
		
		
		ListIterator l=al.listIterator();
		System.out.println(l.hasPrevious());
		//System.out.println(l.hasPrevious);//mo such element exception
		// TODO Auto-generated method stub
		System.out.println(l.next());

	}

}
