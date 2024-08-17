package javaUSTProject;

public class Prime_NotPrime_LessIteration_13_08 {
	public static void main(String args[]) {
		int n=17,a=3;
		boolean is_prime=true;
		if((n/2)>7) {
			a=7;
		}
		else {
			a=n;
		}
		//System.out.println(a+" is value of a");
		for(int i=2;i<=a/2+1;i++) {
			//System.out.println(" iteration");
			if(n%i==0) {
				is_prime=false;
			}
		}
        if(is_prime) {
        	System.out.println(n+" is a prime number");
        }
        else {
        	System.out.println(n+" is not a prime number");
        }
	}
}