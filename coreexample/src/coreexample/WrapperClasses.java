package coreexample;

public class WrapperClasses {

	public static void main(String[] args) {
		//String studentMarks="80";
		//int marks=Integer.parseInt(studentMarks);
		Integer testMarks = 0;
		if (testMarks == null) {
			System.out.println("absent");
		} else if (testMarks <80) {
			System.out.println("selected");
		} else if (testMarks > 50) {
			System.out.println("pass but not selcted");
		} else {
			System.out.println("failed");
		}
		byte byteDT = 127;
		int intDT = byteDT;
		System.out.println("intDT:" + intDT);

		int intDT2 = 125;
		byte byteDT2 = (byte) intDT2;
		System.out.println("byteDT2:" + byteDT2);
		if (intDT2 >= Byte.MIN_VALUE && intDT2 <= Byte.MAX_VALUE) {
			byte byteDT3 = Byte.parseByte("" + intDT2);

			System.out.println("Byte Converted value:" + byteDT3);
		}



		}

	}

