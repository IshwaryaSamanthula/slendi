package collections;

import java.util.ArrayDeque;
import java.util.Collection;

public class ClearExample {

	public static void main(String[] args) {
	Collection<String>collection=new ArrayDeque<String>();
	collection.add("hello");
	collection.add("how");
	collection.add("are");
	System.out.println("Collection:"+collection);
	System.out.println("After applying clear() method:");
	collection.clear();
	System.out.println("Collection:"+collection);
	

	}

}
