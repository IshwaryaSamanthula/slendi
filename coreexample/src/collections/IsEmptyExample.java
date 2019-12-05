package collections;

import java.util.ArrayDeque;
import java.util.Collection;

public class IsEmptyExample {

	public static void main(String[] args) {
		Collection<String>collection=new ArrayDeque<String>();
		collection.add("Mabline");
		collection.add("lakme");
		if(collection.isEmpty()) {
			System.out.println(" The line is empty.");
		}
		else {
			System.out.println("Elments are:"+collection);
		}
				

	}

}
