import java.io.*;

// Constructors In Inheritance 

class A
{
	A()
	{
		System.out.println("Am Constructor-A-0");
	}
	
	A(int x)
	{
		System.out.println("Am Constructor-A-1");
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
		super(4);
		System.out.println("Am Constructor-B-0");
	}
	B(int x)
	{
		System.out.println("Am Constructor-B-1");
	}
	public void disp()
	{
		System.out.println("I AM B");
	}
}

class C extends A
{
	public void disp()
	{
		System.out.println("I AM C");
	}
}

class In1
{
	public static void main(String[] arg)
	{
		A a;
		a = new A();

		B b;
                b = new B();
		b = new B(5);
	}
}
