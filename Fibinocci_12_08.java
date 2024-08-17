package javaUSTProject;

public class Fibinocci_12_08 {
	public static void main(String args[]) {
		int a=0,b=1,c=0;
		for(int i=1;a<=1000;i++) {
			System.out.println(a);
			c=a;
			a=b+c;
			b=c;
		}
	}
}
