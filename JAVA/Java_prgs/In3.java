import java.io.*;

/* Access Specifiers... */


class A
{

	public int a;
	private int b;
	protected int c;


	public void getA()
	{
		a = 10;
		b = 20;
		c = 30;
	}

	public void disp()
	{
		System.out.println("I AM A");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}

class B extends A
{

	public void getB()
	{
		a = 10;
		//b = 20;
		c = 30;
	}

	public void disp()
	{
		System.out.println("I AM B");
		System.out.println("a = "+a);
//		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}

class C
{
	private A x = new A();

	public void getC()
	{
		x.a = 15;
//		x.b = 25;
		x.c = 35;
	}

	public void disp()
	{
		System.out.println("I AM C");
		x.disp();	
	}
}

class In3
{
	public static void main(String[] arg)
	{
		A a;
		B b;
		C c;

		a = new A();
		a.getA();
		a.disp();

		b = new B();
		b.getB();
		b.disp();
	
		c = new C();
		c.getC();
		c.disp();
	}
}
