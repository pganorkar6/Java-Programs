package collectionprog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetUse {

	public static void main(String[] args) {
		HashSet<Integer> hs =new HashSet<>();
		hs.add(25);
		hs.add(456);
		hs.add(788);
		hs.add(789);
		hs.add(741);
		hs.add(852);
		System.out.println(hs);
//		hs.clear();
//		System.out.println(hs);
		Object hs1 = hs.clone();
		System.out.println(hs1);
		System.out.println(hs.contains(852));
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(789));
		System.out.println(hs);
		System.out.println(hs.size());
		for(Integer a:hs)
		{
			System.out.println(a);
		}
		System.out.println("---------------------------------------------------------------------");
        Iterator<Integer> iths = hs.iterator();
        while(iths.hasNext())
        {
        	System.out.println(iths.next());
        }
	    LinkedHashSet<Object> lhs=new LinkedHashSet<>();
	    lhs.add("shyam");
	    lhs.add(45);
	    lhs.add(null);
	    lhs.add(null);
	    lhs.add("Pratik");
	    System.out.println(lhs);
	
	
	
	
	
	
	}

}
