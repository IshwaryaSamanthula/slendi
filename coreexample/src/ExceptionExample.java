

public class ExceptionExample {

	public static void main(String[] args) {
		int totalMarks=362;
		int totalSubjects=8;
		float avgMarks=0;
		String errorMessage="";
		System.out.println("start");
		try {
			System.out.println("Try:to write doughtable code");
		
		avgMarks=totalMarks/totalSubjects;
		}catch(ArithmeticException ae) {
			errorMessage="Service has a issue please try again later...";
			System.out.println("catch:to catch and handle the exception ");
		}finally {
			System.out.println("Finally:to nullify the objects and can get executed always");
		}
		if(errorMessage!="") {
			System.out.println(errorMessage);
		}else {
		System.out.println("avgMarks:"+avgMarks);
	}
		System.out.println("end");
		
		

	}

}

