package JAva8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) 
	{
		
		HashSet<Integer> h = new HashSet();
		for(int i=1;i<11;i++)
		{
			h.add(i);
			
		}
		HashSet<Integer> h1 = new HashSet();
		Set<Integer> j = h.stream().map(i-> i*i).collect(Collectors.toSet());
		System.out.print(j);
		Iterator i = h.iterator();
		while(i.hasNext())
		{
			int z = (Integer) i.next();
			h1.add(z*z);
		}
		Iterator i1 = h1.iterator();
		while(i1.hasNext())
		{
			
			System.out.print(i1.next() + " ");
		}
		

	
	}
}
