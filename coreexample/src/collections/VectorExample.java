package collections;

 import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> southStates = new Vector<String>();
		southStates.add("AP");
		southStates.add("TG");
		southStates.add("TN");
		southStates.add("KT");
		southStates.add("1,KR");
		southStates.add("null");
		southStates.add("AP");
		southStates.add("null");
		southStates.add("AP");
		southStates.add("null");
		southStates.add("AP");
		southStates.add("null");
		southStates.add("AP");
		southStates.add("null");
		southStates.add("AP");

		List<String> northStates = new Vector<String>();
		northStates.add("OD");
		northStates.add("PB");
		northStates.add("OD");
		northStates.add("PB");
		List<String> indianStates = new Vector<String>();
		indianStates.addAll(northStates);
		indianStates.addAll(0, southStates);

		Iterator<String> iterator = southStates.iterator();
		String stateCode = null;
		while (iterator.hasNext()) {
			stateCode = iterator.next();
			System.out.println(stateCode);

		}

	}
}
