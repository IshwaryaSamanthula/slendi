package coreexample;

public class StringBufferAndBulider {

	public static void main(String[] args) {
		String name = "Ishwarya";
		name = name.concat("samanthula");
		StringBuffer fullname = new StringBuffer("");
		System.out.println(fullname + "," + fullname.hashCode());
		fullname.append("Ishwarya");
		System.out.println(fullname + "," + fullname.hashCode());
		fullname.append("reddy");
		System.out.println(fullname + "," + fullname.hashCode());
		fullname.append("samanthula");
		System.out.println(fullname + "," + fullname.hashCode());
		fullname.insert(0,"test");
		System.out.println(fullname + "," + fullname.hashCode());
		fullname.delete(0,2);
		System.out.println(fullname + "," + fullname.hashCode());
		fullname.reverse();
		System.out.println(fullname + "," + fullname.hashCode());
		
		StringBuilder fullnameSB=new StringBuilder("");
		System.out.println(fullnameSB + "," + fullnameSB.hashCode());
		fullnameSB.append("reddy");
		System.out.println(fullnameSB + "," + fullnameSB.hashCode());
		fullnameSB.append("samanthula");
		System.out.println(fullnameSB + "," + fullnameSB.hashCode());
		fullname.insert(0,"test");
		System.out.println(fullname + "," + fullname.hashCode());
		fullname.delete(0,2);
		System.out.println(fullname + "," + fullname.hashCode());
		fullname.reverse();
		System.out.println(fullname + "," + fullname.hashCode());
		

	}

}
