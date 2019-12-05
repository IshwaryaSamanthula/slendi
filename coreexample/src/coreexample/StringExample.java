package coreexample;

public class StringExample {

	public static void main(String[] args) {

		String fullname = "";
		System.out.println(fullname + "," + fullname.hashCode());

		fullname = fullname + "ishu";
		System.out.println(fullname + "," + fullname.hashCode());
		fullname = fullname + " reddy";
		System.out.println(fullname + "," + fullname.hashCode());
		fullname += " samanthula";
		System.out.println(fullname + "," + fullname.hashCode());
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.hashCode() + "and" + s2.hashCode());
		if (s1 == s2) {
			System.out.println("both the object hashcodes are same");
		}
		if (s1.equals(s2)) {
			System.out.println("both the object values are same  and it iscase sensitive ");
		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("both the object value are same and it is case insensitive ");
		}
		char charDt;

		for (int index = 0; index < fullname.length(); index++) {
			charDt = fullname.charAt(index);

			System.out.println(charDt);
		}

	}

}
