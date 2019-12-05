package collections;

import java.util.ArrayList;

public class IndexofExample {

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<String>();
	      al.add("ishu");
	      al.add("ravali");
	      al.add("reshmi");
	      al.add("tirupura");
	      al.add("revathi");
	      al.add("chinmayi");
	      al.add("devaki");

	      System.out.println("Index of 'ishu': "+al.indexOf("ishu"));
	      System.out.println("Index of ravali: "+al.indexOf("ravali"));
	      System.out.println("Index of 'tirupura': "+al.indexOf("tirupura"));
	      System.out.println("Index of 'mouni': "+al.indexOf("mouni"));
		

	}

}
