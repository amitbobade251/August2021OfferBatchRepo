package com.icici.loans.carloans;

public class B extends A // ISA Relationship
{
	public void m1()
	{
		System.out.println("iam overridden m1 from B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from B");
	}

	public static void main(String[] args) 
	{
		A a = new A(); //HASA Relationship
		a.m1();
		
		A obj = new B();
		obj.m1();
		
		//B obj1 = new A();
		
		
		//B b = new B();
		//b.m1();
		//b.m2();
	}

}
