package day7collection;

import java.util.Comparator;

public class SnameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSname().compareTo(o2.getSname());
	}

}
