package javaUSTProject;

public class Arraysort_Boolean_14_08 {
	public static void main(String args[]) {
		int number[]= {5,6,8,2,-1,9};
		boolean sortflag=false;
		System.out.println("----Array before sorting---- ");
		print (number);
		int [] rnum = sort(number,sortflag);
		System.out.println("----Array after sorting---- ");
		print (rnum);
	}
	static int [] sort (int [] avalues, boolean sortflag) {
		if (sortflag)
		{
			System.out.println("----Ascending Order---- ");
			for(int i=0;i<avalues.length;i++) {
				for(int j=0;j<avalues.length-1-i;j++) {
					if(avalues[j]>avalues[j+1]) {
						int temp=avalues[j];
						avalues[j]=avalues[j+1];
						avalues[j+1]=temp;
					}
				}
			}
		}
		else {
			System.out.println("----Descending Order---- ");
			for(int i=0;i<avalues.length;i++) {
				for(int j=0;j<avalues.length-1-i;j++) {
					if(avalues[j]<avalues[j+1]) {
						int temp=avalues[j];
						avalues[j]=avalues[j+1];
						avalues[j+1]=temp;
					}
				}
			}
		}
		return avalues;
	}
	static void print(int [] arr) {
		System.out.println("----Display Begin---- ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Order of number "+i+ "is "+ arr[i]);
		}
		System.out.println("----Display End---- ");
	}
}