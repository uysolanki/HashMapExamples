package day7collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Double> itDept=new HashMap();
		itDept.put("Alice", 800.0);
		itDept.put("Ben", 900.0);
		itDept.put("Chris", 1000.0);
		itDept.put("Dom", 700.0);
		itDept.put("Chris", 1700.0);
		System.out.println(itDept);
		
//		System.out.println(itDept.get("Ben"));
		Set<String> keys=itDept.keySet();
//		String keys[]=(String[])itDept.keySet().toArray();
//		System.out.println(keys);
		for(String key:keys)
		{
			System.out.println("Key : " +key + " Value :" +itDept.get(key));
		}
	}

}
