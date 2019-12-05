package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> southStates = new ArrayList<String>();
		southStates.add("AP");
		southStates.add("TG");
		southStates.add("TN");
		southStates.add("KT");
		southStates.add(0,"KR");
		southStates.add("null");
		southStates.add("AP");
		southStates.add("null");
		southStates.add("AP");
		southStates.add("null");
		southStates.add("AP");
		System.out.println("southStates:" +southStates);

		ArrayList<String> northStates = new ArrayList<String>();
		northStates.add("OD");
		northStates.add("PB");
		northStates.add("OD");
		northStates.add("PB");
		System.out.println("northStates:" +northStates);

		List<String> indianStates = new ArrayList<String>();
		indianStates.addAll(northStates);
		indianStates.addAll(0, southStates);
		Collections.sort(indianStates);
		System.out.println("indianStates:" +indianStates);


		Iterator<String> iterator = indianStates.iterator();
		String stateCode = null;
		while (iterator.hasNext()) {
			stateCode = iterator.next();
			System.out.println(stateCode);
		}

	}

}
