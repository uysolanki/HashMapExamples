package day7collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList();
		names.add("Alice");
		names.add("Ben");
		names.add("Chris");
		names.add("Dom");
		
//		Iterator<String> iterator=names.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		
		
		ListIterator<String> listIterator=names.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}

		System.out.println("******************");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
	}

}
