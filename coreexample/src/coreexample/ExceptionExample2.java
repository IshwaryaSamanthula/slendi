package coreexample;

public class ExceptionExample2 {

	public static void main(String[] args) {
	 int TotalMarks=350;
	 int  TotalSubjects=5;
	 float avgMarks=0;
	  String errorMessage ="";
	  System.out.println("start");
	  try {
		  avgMarks=TotalMarks/TotalSubjects;
		  }catch(ArithmeticException ae) {
			  errorMessage="Service had issue please try again later..";
			  throw ae;
		  }
	  finally {
		  
	  }
	  System.out.println("avgMarks"+avgMarks);
	  
	  System.out.println("end");
	}
	  public static float getAverageMarks(int totalMarks,int totalSubjects){
		  float avgMarks=0;
		  try {
		  avgMarks=totalMarks/totalSubjects;
		  }catch(ArithmeticException ae) {
			  throw ae;
		  }
		  return avgMarks;
	  }

}
