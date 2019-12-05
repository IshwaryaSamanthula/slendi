package coreexample;

public class StringExamples {
	public static void main(String[] args) {
		String s1="abc";
		String s2= new String("Abc");
		//hashcode: Memory location address of the object
		System.out.println(s1.hashCode()+ " and "+s2.hashCode());
		
		if(s1==s2) {
			System.out.println("Hashcode references are same");
		}
		if(s1.equals(s2)) {
			System.out.println("Values are same and it's case sensitive");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Values are same and it's case insensitive");
		}
		//if we do a manipulation n of times n no of objects will be changed,
		//so we get different hashcode for fullname
		String fullname="";
		//fullname hashcode is 0 because there is no data
		System.out.println("fullname hashcode "+fullname.hashCode());
		
		fullname+="It is ";
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname+="string ";
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname=fullname.concat("example");
		System.out.println(fullname+", "+fullname.hashCode());
		
		System.out.println("Length: "+fullname.length());
		char charDT;
		for(int i=0; i<fullname.length(); i++) {
			charDT = fullname.charAt(i);
			System.out.print(charDT);
		}
		System.out.println();
		int indexOf=fullname.indexOf("g");
		System.out.println(+indexOf);
		int lastIndexOf=fullname.lastIndexOf("g");
		System.out.println(+lastIndexOf);
		boolean contains=fullname.contains("ing");
		
		contains=fullname.contains("ewhkjknv");
		
		String replace=fullname.replace(" ", ",");
		
		String[] split=fullname.split(" ");
		
		String subString1=fullname.substring(0,9);
		String subString2=fullname.substring(9);
		System.out.println("End");
	}

}



