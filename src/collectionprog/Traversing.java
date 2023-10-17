package collectionprog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(null);
		al.add(25);
		al.add(2, 225);
		al.add(226);
		al.add(487);
		al.add(789);
		System.out.println(al);
		System.out.println("----------------------------------------------------------------1");
		//using static for loop
		for(int i=0;i<=5;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("----------------------------------------------------------------2");
	    //using dynamic loop
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("----------------------------------------------------------------3");
		//using each loop
		for(Integer a:al)
		{
			System.out.println(a);
		}
		System.out.println("-----------------------------------------------------------------4");
		//iterator
		Iterator<Integer> it=al.iterator(); 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-------------------------------------------------------------------5");
		ListIterator<Integer>lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
	
	
	
	
	
	
	}
	

}
