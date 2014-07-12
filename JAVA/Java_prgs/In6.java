import java.io.*;

/* Run Time Polymorphism */

class A
{
	void show1()
	{
		System.out.println("I am A");
	}
}

class B extends A
{
	void show2()
	{
		System.out.println("I am B");
	}
}

class C extends A
{
	void show3()
	{
		System.out.println("I am C");
	}
}

class In6	
{
	public static void main(String[] arg)
	{
		A x;
		
		x = new A();
		x.show1();

		x = new B();
		x.show1();
		x.show2();


		x = new C();
		x.show1();
		x.show3();
	}
}