package listdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> bookSet = new TreeSet<>();
		bookSet.add("Java in nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in java");
		bookSet.add("Think in 21 days");
		bookSet.add("Java for dummys");
		
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in nutshell"));
		
		bookSet.add("Thinking in java");
		System.out.println(bookSet.size());
		
		for(String book: bookSet) {
			System.out.println(book);
		}
		
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
				
		

	}

}
