package collections;

import java.util.ArrayDeque;
import java.util.Collection;

public class RemoveExample {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayDeque<>();
		collection.add("Lotus");
		collection.add("Garnier");
		collection.add("Mabline");
		collection.add("Lakme");
		collection.add("Clean and clear");
		for(String i:collection) {
			System.out.println(i);
		}
		collection.remove("Mabline");
		System.out.println("After removing Mabline\ncollection:"+collection);

	}

}
