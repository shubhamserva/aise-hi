package JAva8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class HashSetMapping 
{
	public static void main(String args[])
	{
		
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<10;i++) 
		{
			h.add(i);
		}
		System.out.println(h);
		
		Set s =  h.stream().map(x ->x *x).collect(Collectors.toSet());
		System.out.println(s);
		
		
		
	}
	

}
