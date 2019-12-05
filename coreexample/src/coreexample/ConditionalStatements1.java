package coreexample;

public class ConditionalStatements1 {

	public static void main(String[] args) {
	int marks=571;
	String grade="";
	if(marks>=650) {
		grade="A+";
	}else if (marks>=600) {
	grade="A";
	}else if (marks>=550) {
		grade="B+";
	}else if (marks>=500) {
		grade="B";
	}else if (marks>=450) {
		grade="C+";
	}else if (marks>=400) {
		grade="C";
	}else   {
		grade="NA";
	}
	System.out.println(marks+":"+grade);
	

	}

}
