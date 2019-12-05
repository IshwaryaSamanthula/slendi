package collections;

import java.util.ArrayList;

public class TrimSizeExample {

	public static void main(String[] args) {
		 ArrayList<Integer> arraylist = new ArrayList<Integer>(50);
		    arraylist.add(1);
		    arraylist.add(2);
		    arraylist.add(3);
		    arraylist.trimToSize();
		    System.out.println(arraylist);
		  }
		

	}


