import java.io.*;

/* Run Time Polymorphism */

class A
{
	void show()
	{
		System.out.println("I am A");
	}
	void dispA()
	{
		System.out.println("I am Disp of A");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("I am B");
	}
	void dispB()
	{
		System.out.println("I am Disp of B");
	}
}

class C extends A
{
	void show()
	{
		System.out.println("I am C");
	}
	void dispC()
	{
		System.out.println("I am Disp of C");
	}
}

class In5
{
	public static void main(String[] arg)
	{
		A x;
		
		x = new A();
		x.show();
		x.dispA();

		x = new B();
		x.show();
		x.dispA();
		//x.dispB();

		x = new C();
		x.show();
		x.dispA();
		//x.dispC();
	}
}