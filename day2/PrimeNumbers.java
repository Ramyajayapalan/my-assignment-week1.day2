package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		int numb=15;
		boolean out =false;
		
		
for (int i= 2; i<=numb/2; i++) {
	int a;
	a=numb%i;
	if(a==0) {
		out=true;
	}
	break;
	
	}
if(out==true) {
	System.out.println("prime");
	}
else {
	System.out.println("Not aprime");
	
}
	

	}

}
