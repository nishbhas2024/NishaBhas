package javaUSTProject;

public class Factorial_Function_13_08 {
	public static void main(String args[]) {
		int i=5;
		System.out.println("Factorial of number "+i+" is "+ fact(i) );
	}
	static int fact(int f) {
		if(f==1){
			return 1;
		}
		else {
		     return f*fact(f-1);
		}
	}
}
		
		
		

