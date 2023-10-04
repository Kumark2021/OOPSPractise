package com.OOPS;

class Product{
	//Attributes
	int pid;
	String name;
	int price;
	
	//constructor
	Product()
	{
		System.out.println("Product Object Constructed");
	}
	
	//Method
	
	void setProductDetails(int pid,String name,int price)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	void showProductDtails()
	{
		System.out.println("....pid "+pid+".....");
		System.out.println("Name:\t"+name);
		System.out.println("price:\t"+price);
	}
	
	class Mobile extends Product{
		
		String os;
		int ram;
		int sCardSze;
		Mobile()
		{
			System.out.println("Mobile boject constructed");
		}
		void setProductDetails(int pid,String name,int price, String os,int ram,int SCardSze, int sCardSze)
		{
			this.pid=pid;
			this.name=name;
			this.price=price;
			this.os=os;
		    this.ram=ram;
			this.sCardSze=sCardSze;
			System.out.println("data is written in product object");
		}
		
		void showProductDtails()
		{
			System.out.println("....pid "+pid+".....");
			System.out.println("Name:\t"+name);
			System.out.println("price:\t"+price);
			System.out.println("OS:\t"+os);
			System.out.println("ram:\t"+ram);
			System.out.println("sCardSze:\t"+sCardSze);
			
		}
		
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Product product =new Product();
	
		product.setProductDetails(101, "Apple",100000);
		product.showProductDtails();
		System.out.println();
		
		
		//com.OOPS.Product.Mobile mobile=new com.OOPS.Product.Mobile();
		//mobile.se
		
		
		//Mobile mob=new Mobile();
		
		
		
	}

}
