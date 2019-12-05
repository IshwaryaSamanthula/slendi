package collections;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEX {

	public static void main(String[] args) {
		Set<String> southStates = new TreeSet<String>();
		southStates.add("AP");
		southStates.add("TG");
		southStates.add("TN");
		southStates.add("KT");
		southStates.add("1,KR");
		southStates.add("null");
		southStates.add("AP");
		southStates.add("null");
		southStates.add("AP");
		
		southStates.add("AP");
		System.out.println("southStates:" + southStates);

		Set<String> northStates = new TreeSet<String>();
		northStates.add("OD");
		northStates.add("PB");
		northStates.add("OD");
		northStates.add("PB");
		System.out.println("northStates:" + northStates);

		Set<String> indianStates = new TreeSet<String>();
		indianStates.addAll(northStates);
		indianStates.addAll(southStates);
		// Collections.sort(indianStates);
		System.out.println("indianStates:" + indianStates);

		Iterator<String> iterator = indianStates.iterator();
		String stateCode = null;
		while (iterator.hasNext()) {
			stateCode = iterator.next();
			System.out.println(stateCode);

	}

}
}
