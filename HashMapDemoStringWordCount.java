package day7collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemoStringWordCount {

	public static void main(String[] args) {
		String sentance="two two two three three two one one";
		String words[]=sentance.split(" ");
		System.out.println(Arrays.toString(words));
		HashMap<String,Integer> hashmap=new HashMap();
		for(String s:words)
		{
			if(hashmap.containsKey(s))
			{
				hashmap.put(s,hashmap.get(s)+1);	
			}
			else
			{
				hashmap.put(s, 1);
			}
		}
		
		Set<String> keys=hashmap.keySet();
//		for(String k:keys)
//		{
//			System.out.println(k + " :" + hashmap.get(k));
//		}
		System.out.println(hashmap);
		int max=0;
		String result="";
		for(String k:keys)
		{
			if(hashmap.get(k)>max) {
				max=hashmap.get(k);
				result=k;
			}
		}
		System.out.println("Maximum occring word  " + result);
	}
        //	[{},{},{}]
}
