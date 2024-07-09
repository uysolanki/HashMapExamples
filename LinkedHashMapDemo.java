package day7collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	Map<String,Double> itDept=new LinkedHashMap();
	itDept.put("Alice", 800.0);
	itDept.put("Ben", 900.0);
	itDept.put("Frank", 1000.0);
	itDept.put("Dom", 700.0);
	itDept.put("Chris", 1700.0);
	System.out.println(itDept);
}
}
