package collections;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnuEX {

	public static void main(String[] args) {
		
		Hashtable<String, String> indianStates = new Hashtable<String, String>();

		indianStates.put("AP", "ANDHRAPRADESH");
		indianStates.put("TG", "TELANGANA");
		indianStates.put("KT", "KARNATAKA");
		indianStates.put("KL", "KERALA");

		Set<String> Keyset = indianStates.keySet();
		Enumeration code=  indianStates.elements();

		
		while (code.hasMoreElements()) {
			System.out.println(code.nextElement());
	
		}

		indianStates.remove("kL");
		indianStates.replace("KT", "Karnataka", "KARNAtAkA");
		Collection<String> values = indianStates.values();

			boolean containsKey = indianStates.containsKey("AP");
			boolean containsValue = indianStates.containsValue("ANDHRAPRADESH");
			System.out.println("containsKey:" + containsKey);
			System.out.println("containsValue:" + containsValue);

			//remove
			 boolean b=indianStates.remove("KL","KERALA");
			System.out.println("remove:"+b );
			System.out.println("remove:"+indianStates);
			
	//replace value
			 String g=indianStates.replace("KT","South");
				System.out.println("replace:"+g );
				System.out.println("replace:"+indianStates);
			
			
			indianStates.replace("KT", "Karnataka", "KARNAtAkA");
			//contains key
			
				boolean containsKey1 = indianStates.containsKey("AP");
		   //contains value
				  
				boolean containsValue1 = indianStates.containsValue("ANDHRAPRADESH");
				System.out.println("containsKey1:"+containsKey1);
				System.out.println("containsValue:"+containsValue1);
				
		//replace
				 boolean f=indianStates.replace("KT", "South", "North");
					System.out.println("replace:"+f );
					System.out.println("KT:"+indianStates);
		//is empty
					indianStates.isEmpty();
					System.out.println("Is Empty:"+indianStates.isEmpty()) ;
					
			//clear
			indianStates.clear();
			System.out.println("Map elements are clear:"+indianStates);		
				

			}

		



		




	

}

	


