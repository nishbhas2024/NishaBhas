package javaUSTProject;
class ShoppingCart {
	Product sprod[];
	int cindex;
	ShoppingCart(){
		sprod=new Product[3];
		cindex=0;
	}
	Product addProduct(Product prod){
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
		sprod=new Product[3];
		cindex=0;
		System.out.println("All products in the cart deleted ");
	}
	void checkoutCart() {
		float total=0;
		for(int i=0;i<cindex;i++) {
			total+=sprod[i].price;
		}
		System.out.println("Total of All Products   | "+total);
	}
}
class Product{
	int id;
	String name;
	float price;
	Product(){
		id=0;
		name="a";
		price=0;
	}
	Product (int pid, String pname, float pprice){
		id = pid;
		name = pname;
		price = pprice;
	}
	void display() {
		System.out.println(id+"\t|"+name+"\t\t|"+price);
	}
}

public class ShoppingCart_Class_16_08 {
	public static void main(String args[]) {
		System.out.println("----Item Details---- ");
		System.out.println("Id"+"\t|"+"Name \t\t|"+"Price");
		ShoppingCart scart=new ShoppingCart();
		Product p1=new Product(100,"Chair",1000);
		scart.addProduct(p1);
		Product p2=new Product(101,"Table",2000);
		scart.addProduct(p2);
		Product p3=new Product(102,"Sofa",3000);
		scart.addProduct(p3);
		scart.listProduct();
		scart.checkoutCart();
		scart.emptyCart();
		scart.listProduct();
	}
}