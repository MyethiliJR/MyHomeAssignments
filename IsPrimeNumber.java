package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=30; //number to check
boolean isPrime= true;
for (int i = 2; i < n; i++) {
	if(n%2==0) {
		isPrime=false; //If n is divisible by any number other than 1 and itself
		break;
	}
}

// Print whether n is prime or not
	if(isPrime) {
	System.out.println("The number is a Prime");
	}else {
		System.out.println("The number is not a prime");
	}
		
}
}


