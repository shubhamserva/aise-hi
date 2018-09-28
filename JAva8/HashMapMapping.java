package JAva8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapMapping {

	public static void main(String[] args) 
	{
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"shubham");
		hm.put(2, "LALA");
		hm.put(3,"RAHUL");
//			
//		String result = "";
//		for (Map.Entry<Integer, String> entry : map.entrySet()) {
//			if("something".equals(entry.getValue())){
//				result = entry.getValue();
//		

		System.out.println(hm.values());
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		String match = "LALA";
		for (Map.Entry<Integer,String> s:hm.entrySet()) 
		{
			if(match.equals(s.getValue())) 
			{
				System.out.println(s.getKey());
			}
		}
		
		Map<Object, Object> hh = hm.entrySet().stream().filter(x-> "RAHUL".equals(x.getValue())).collect(Collectors.toMap(x-> x.getKey(),x->x.getValue()));
		System.out.println(hh);
	}
}
