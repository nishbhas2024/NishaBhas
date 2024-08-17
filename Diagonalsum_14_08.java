package javaUSTProject;
public class Diagonalsum_14_08 {
	public static void main(String[] args) {
	    int number[][]= new int[3][3];
	    int diasum[][];
	    number[0][0]= 5;
	    number[0][1]=2;
	    number[0][2]=9;
	    number[1][0]= 7;
	    number[1][1]= 8;
	    number[1][2]=19;
	    number[2][0]= 17;
	    number[2][1]= 18;
	    number[2][2]=29;		
		System.out.println("----Two Diamentional Array---- ");
		print (number);
		diasum(number);
	}
	static void print(int[][] arr) {
		System.out.println("----Display Begin---- ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
				}
			System.out.println();
		}
		System.out.println("----Display End---- ");
	}
	static int[][] diasum(int[][] arr) {
		int fdiasum=0;
		System.out.println("----Diagonal Sum---- ");
		for(int i=0;i<arr.length;i++) {
			fdiasum+=arr[i][i]+arr[i][arr.length-1-i];
		}
		System.out.println("Sum is "+ fdiasum);
		return arr;
	}
}