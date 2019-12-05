package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEX {

	public static void main(String[] args) {
		TreeMap<String, String> indianStates = new TreeMap<String, String>();

		indianStates.put("AP", "ANDHRAPRADESH");
		indianStates.put("TG", "TELANGANA");
		indianStates.put("KT", "KARNATAKA");
		indianStates.put("KL", "KERALA");

		Set<String> set = indianStates.keySet();

		Iterator<String> iterator = set.iterator();
		String Key = null;
		String value = "";
		while (iterator.hasNext()) {
			Key = iterator.next();
			value = indianStates.get(Key);
			System.out.println(Key + ":" + value);
		}
		boolean containskey = indianStates.containsKey("Ap");
		boolean containsValue = indianStates.containsValue("Ap");

		indianStates.remove("kL");
		indianStates.replace("KT", "Karnataka", "KARNAtAkA");
		Collection<String> values = indianStates.values();

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
			
				boolean containsKey = indianStates.containsKey("AP");
		   //contains value
				  
				boolean containsValue1 = indianStates.containsValue("ANDHRAPRADESH");
				System.out.println("containsKey:"+containsKey);
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



		



	


