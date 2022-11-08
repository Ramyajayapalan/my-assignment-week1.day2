package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
	int num=34343;
	int temporarynumber = num;
	int temp=0;
	for (int i=0; num>0; i++);{
	int remainder;
	remainder=num%10;
	temp = (temp*10)+remainder;
	num =num/10;
	}
	if(temporarynumber ==temp) {
		System.out.println("palindrome number");
	
		}
	else {
		System.out.println("not palindrome number");
	}
	}
}

