package coreexample;

public class LoopingExample {


	public static void main(String[] args) {
		int forTotal=0;
		for(int index=1;index<=5;index++) {
			forTotal=forTotal+index;
			
		}
		System.out.println("forTotal:"+forTotal);
		int whileTotal=0;
		int WhileIndex=1;
		while(WhileIndex<=5){
		whileTotal=whileTotal+WhileIndex;
		WhileIndex++;
		}
		System.out.println("WhileTotal:"+whileTotal);
		int doWhileTotal=0;
		int doWhileIndex=1;
		do {
			doWhileTotal=doWhileTotal+doWhileIndex;
			doWhileIndex++;
			
		}while(doWhileIndex<=5);
System.out.println("doWhileTotal:"+doWhileTotal);
	}

}
