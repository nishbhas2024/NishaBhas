package javaUSTProject;
class EmployerDetails {
	Employer sprod[];
	int cindex;
	EmployerDetails(){
		sprod=new Employer[3];
		cindex=0;
	}
	Employer addProduct(Employer prod){
		sprod[cindex]=prod;
		cindex++;
		return prod;
	}
	void listProduct() {
		System.out.println("--------------------------------- ");
		for(int i=0;i<cindex;i++) {
			sprod[i].display();
		}
		System.out.println("--------------------------------- ");
	}
	void emptyCart() {
		System.out.println("--------------------------------- ");
		sprod=new Employer[3];
		cindex=0;
		System.out.println("Employee Details has been deleted ");
	}
	void checkoutCart() {
		float total=0;
		for(int i=0;i<cindex;i++) {
			total+=sprod[i].price;
		}
		System.out.println("Total Salary\t\t|"+total);
	}
}
class Employer{
	int id;
	String name;
	float price;
	Employer(){
		id=0;
		name="a";
		price=0;
	}
	Employer (int pid, String pname, float pprice){
		id = pid;
		name = pname;
		price = pprice;
	}
	void display() {
		System.out.println(id+"\t|"+name+"\t\t|"+price);
	}
}

public class EmployerDetails_16_08 {
	public static void main(String args[]) {
		System.out.println("---------Employee Details------- ");
		System.out.println("Id"+"\t|"+"Name \t\t|"+"Salary");
		EmployerDetails scart=new EmployerDetails();
		Employer p1=new Employer(100,"Nisha",1000);
		scart.addProduct(p1);
		Employer p2=new Employer(101,"Saayuj",2000);
		scart.addProduct(p2);
		Employer p3=new Employer(102,"Sajith",3000);
		scart.addProduct(p3);
		scart.listProduct();
		scart.checkoutCart();
		scart.emptyCart();
		scart.listProduct();
	}
}