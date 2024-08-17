package javaUSTProject;

public class Prime_Not_Function_13_08 {
	public static void main(String args[]) {
		int prime[]=new int[3];
		prime[0]=5;
		prime[1]=8;
		prime[2]=15;
		print(prime);
		
	}
	static int[] print(int[] pr) {
		boolean is_prime=true;
		int v=pr.length;
		for(int j=0;j<3;j++) {
			for(int i=2;i<=v/2+1;i++) {
				if(pr[j]%i==0) {
					is_prime=false;
				}
			}
			if(is_prime) {
				System.out.println(pr[j]+" is a prime number");
			}
			else {
				System.out.println(pr[j]+" is not a prime number");
			}
		}
        return pr;
	}
}
		
		
		

