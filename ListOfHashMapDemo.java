package day7collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListOfHashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Athlete> m100=new HashMap();
		m100.put("first", new Athlete(18,"Virat",11.5));
		m100.put("second", new Athlete(45,"Rohit",12.5));
		m100.put("third", new Athlete(1,"Rahul",13.5));
		System.out.println("2nd place in 100m : "+m100.get("second").getName());
		HashMap<String,Athlete> m200=new HashMap();
		m200.put("first", new Athlete(63,"Surya",21.5));
		m200.put("second", new Athlete(18,"Virat",22.5));
		m200.put("third", new Athlete(17,"Rishab",23.5));
		HashMap<String,Athlete> m400=new HashMap();
		m400.put("first", new Athlete(88,"Alice",44.5));
		m400.put("second", new Athlete(89,"Ben",45.5));
		m400.put("third", new Athlete(90,"Chris",46.5));
		Athlete athlete=m200.get("third");
		System.out.println("3rd place in 200m : "+athlete.getName());
		System.out.println(m100);
		System.out.println(m200);
		System.out.println(m400);
		
		List<HashMap<String,Athlete>>  olympic=new ArrayList();
		olympic.add(m100);  //index 0
		olympic.add(m200);  //index 1
		olympic.add(m400); 
		//display the name of the athlete who came second in 100m using olympic.
		System.out.println("2nd place in 100m : " +olympic.get(0).get("second").getName());
		
		//display the name of the athlete who came first in a race
		for(int i=0;i<olympic.size();i++)
		{
			System.out.println(olympic.get(i).get("first").getName());
		}

	}

}
