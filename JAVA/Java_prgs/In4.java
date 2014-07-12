import java.io.*;

/* Abstract Class */


abstract class A
{
	public int a;
	
	abstract public void get();

	abstract public void disp();

}

class B extends A
{
	public int b;
	
	public void get()
	{
		a = 25;
		b = 45;
	}

	public void disp()
	{	
		System.out.println("In B: ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

class C extends B
{
	public int c;
	
	public void get()
	{
		a = 25;
		b = 35;
		c = 45;
	}

	public void disp()
	{	
		System.out.println("In C: ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}	

class In4
{
	public static void main(String[] arg)
	{
		A a;
		B b;
		C c;

		a = new B();
		a.get();
		a.disp();

		b = new B();
		b.get();
		b.disp();
	
		b = new C();
		b.get();
		b.disp();
	}
}
