package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Enumeration1 {

	public static void main(String[] args) {
		Hashtable<String, String> indianStates = new Hashtable<String, String>();

		indianStates.put("AP", "ANDHRAPRADESH");
		indianStates.put("TG", "TELANGANA");
		indianStates.put("KT", "KARNATAKA");
		indianStates.put("KL", "KERALA");

		Set<String> set = indianStates.keySet();
		Set<String> Keyset = indianStates.keySet();
		Enumeration code=  indianStates.elements();

		
		while (code.hasMoreElements()) {
			System.out.println(code.nextElement());
	
		}

	}

}
