import java.io.*;

/* Hirarchical */
/* Overriding */

class A
{
	A()
	{
		System.out.println("Cons-A with ZERO argument...");
	}

	A(int x)
	{	
		System.out.println("Cons-A with ONE argument...");
	}

	public void disp()
	{
		System.out.println("I AM A");
	}
}

class B extends A
{
	B()
	{
		this(3);
		System.out.println("Cons-B with ZERO argument...");
	}
	
	B(int x)
	{	
		System.out.println("Cons-B with ONE argument...");
	}

	public void disp()
	{
		System.out.println("I AM B");
	}
}

class C extends A
{
	C()
	{
		System.out.println("Cons-C with ZERO argument...");
	}

	C(int x)
	{
		super(3);
		System.out.println("Cons-C with ONE Argument...");
	}

	public void disp()
	{
		System.out.println("I AM C");
	}
}

class In2
{
	public static void main(String[] arg)
	{
		A a;
		B b;
		C c;

		a = new A();
		a.disp();

		b = new B();
		b.disp();
	
		c = new C(2);
		c.disp();
	}
}
