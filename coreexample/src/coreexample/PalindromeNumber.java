package coreexample;

public class PalindromeNumber {

	public static void main(String[] args) {
int r,sum=0,temp;
int n=454;//It is the number variable to be checked for PalindromeNumber
temp=n;
while(n>0) {
	r=n%10;//getting remainder
	sum=(sum*10)+r;
	n=n/10;
}
if(temp==sum)
System.out.println("Palindrome number");
else
	System.out.println("not palindrome");
	}

}
