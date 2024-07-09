package day7collection;

import java.util.HashMap;

public class OddEvenHashmapDemo {

	public static void main(String[] args) {
		int arr[]= {10,12,11,13,15};
//		int oddCounter=0;
//		int evenCounter=0;
//		
//		for(int n:arr)
//		{
//			if(n%2==0)
//				evenCounter++;
//			else
//				oddCounter++;
//		}
		
		
		HashMap<String,Integer> hashmap=new HashMap();
		hashmap.put("oddCounter", 0);
		hashmap.put("evenCounter", 0);
		System.out.println(hashmap.containsKey("abc"));
		for(int n:arr)
			{
				if(n%2==0)
					hashmap.put("evenCounter",hashmap.get("evenCounter")+1);
				else
					hashmap.put("oddCounter",hashmap.get("oddCounter")+1);
			}
		System.out.println("Count of Odd Numbers "+ hashmap.get("oddCounter"));
		System.out.println("Count of Even Numbers "+ hashmap.get("evenCounter"));

	}

}
