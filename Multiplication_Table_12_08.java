package javaUSTProject;

public class Multiplication_Table_12_08 {
	public static void main(String args[]) {
		int a=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++){
				a=i*j;
				System.out.println(i+" x "+j+" = "+a);
			}
		}
	}
}
