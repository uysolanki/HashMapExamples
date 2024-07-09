package day7collection;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Student> treeset=new TreeSet(new SnameComparator());
		Student s1=new Student(18,"Virat",78.5);  
		Student s2=new Student(45,"Rohit",88.5);  
		Student s3=new Student(1,"Rahul", 98.5);
		Student s4=new Student(63,"Surya", 87.5);
		treeset.add(s1);
		treeset.add(s2);
		treeset.add(s3);
		treeset.add(s4);
		System.out.println(treeset);

	}

}
