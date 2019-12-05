package collections;

import java.util.ArrayDeque;
import java.util.Collection;

public class ContainsExample {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayDeque<>();
		collection.add("Lotus");
		collection.add("Garnier");
		collection.add("Mabline");
		collection.add("Lakme");
		collection.add("Clean and clear");
		if (collection.contains("Mabline")) {
			System.out.println("Mabline is present");
		} else {
			System.out.println("Mabline is not present");
		}

	}

}
