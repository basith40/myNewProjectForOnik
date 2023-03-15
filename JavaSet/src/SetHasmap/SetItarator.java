package SetHasmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetItarator {

	public static void main(String[] args) {
		Set<String> family = new HashSet<>();
		family.add("abdul chowdhury");
		family.add("Shamima shammi");
		family.add("mahira chowdhury");
		family.add("mahima chowdhury");
		family.add("mehrab chowdhury");
		family.add("maisha chowdhury");
		
		Iterator<String> myIterator = family.iterator();
		
		while(myIterator.hasNext()) {
			String my = myIterator.next();
			System.out.println(my);
		}
		
		
		
		

	}

}
