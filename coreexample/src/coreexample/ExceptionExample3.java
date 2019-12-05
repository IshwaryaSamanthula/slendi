package coreexample;

public class ExceptionExample3 {

	public static void main(String[] args) {
		int TotalMarks=390;
		 int  TotalSubjects=5;
		 float avgMarks=0;
		  String errorMessage ="";
		  System.out.println("start");
		  try {
			  avgMarks=getAverageMarks(TotalMarks,TotalSubjects);
			  }catch(ArithmeticException ae) {
				  errorMessage="Service had issue please try again later..";
				  
			  }catch(Exception Ex) {
				  errorMessage="Service had issue please try again later..";
				  
			  }
		  finally {
			  
		  }if(errorMessage !="") {
			  System.out.println(errorMessage);
		  }else {
			  
		  
		  System.out.println("avgMarks"+avgMarks);
		  }
		  
		  System.out.println("end");
		}
		  public static float getAverageMarks(int totalMarks,int totalSubjects)throws ArithmeticException,Exception{
			  
			  
			  return totalMarks/totalSubjects;
		

	}

}
