package com.OOPS;

public class Constructor {

	String name;
	int age;
	String address;

	public Constructor(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;


	}

	public void setName(String name)

	{
		this.name=name;	
	}

	public void setAge(int age)

	{
		this.age=age;	
	}

	public void setAddress(String address)

	{
		this.address=address;	
	}

	 public String  getName()
	 {
		 return name;
	 }
	 public int  getAge()
	 {
		 return age;
	 }
	 public String  getAddress()
	 {
		 return address;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor student=new Constructor("kiran",23,"36A101 Bollineni");
		
		System.out.println("The Student name is "+ student.getName());
		System.out.println("The Student Age is "+ student.getAge());
		System.out.println("The Student Address is "+ student.getAddress());

		

	}

}
