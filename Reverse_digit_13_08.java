package javaUSTProject;

public class Reverse_digit_13_08 {
	public static void main(String args[]) {
		int n=1234,rev=0,rem=1,org=0;
		org=n;
		System.out.println(org+" is the original number");
		for(int i=4;i>0;i--) {
			rem=n%10;
			rev=rem+(rev*10);
			n/=10;
		}
        System.out.println(rev+" is reverse number of "+org);
    }
}