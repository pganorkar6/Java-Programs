package collectionprog;

import java.util.ArrayList;

public class ArrayListProg {

	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<>();
		System.out.println(al);
		al.add(0,"Pratik");
		al.add(true);
		al.add('M');
		al.add('3');
		al.add(false);
		al.add("Hello");
		al.add(true);
		al.add(false);
		al.add("115");
		al.add("225");
		al.add("RAAM");
		System.out.println(al);
		Object al1=al.clone();
		System.out.println(al1);
		System.out.println(al.contains("RAAM"));
		System.out.println(al.contains("Shyaam"));
        System.out.println(al.equals(al1));
        System.out.println(al.get(0));
        System.out.println(al.indexOf(true));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(al.isEmpty());
        System.out.println("----------------------------------------------------------------------");
        System.out.println(al.lastIndexOf(true));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(al.remove(3));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(al.equals(al1));
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(al);
        System.out.println("----------------------------------------------------------------------");
        for(Object a:al) 
        {
        	System.out.println(a);
        }
   
        
        
        
        
	}
	}
