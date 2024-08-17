package javaUSTProject;

public class Average_Petrol_13_08 {
	public static void main(String args[]) {
		int petrol[]=new int[6];
		petrol[0]=50;
		petrol[1]=80;
		petrol[2]=105;
		petrol[3]=101;
		petrol[4]=95;
		petrol[5]=108;
		average(petrol);
	}
	static void average(int[] pr) {
		int v=pr.length,sum=0,av=0;
		for(int i=0;i<v;i++) {
			System.out.println(pr[i] +" is the petrol price of city " +(i+1));
			sum+=pr[i];
		}
		av=sum/6;
		System.out.println(sum +" is the sum of petrol prices of 6 cities");
		System.out.println(av +" is the Average petrol price of 6 cities");
	}
}


