import java.io.*;
import java.util.*;

class Super
{
	private int a;
	private String name1;

	void set()
	{
		a = 1000;
		name1 = "Base";
	}	
	
	void display()
	{
		System.out.println("\nA from Super= "+a);
		System.out.println("Name1 from Super: "+name1);
	}
}

class Sub extends Super
{
	private int b=2009;
	
	void set()
	{
		super.set();
		b = 2000;
	}
	
	void display()
	{
		super.display();
		System.out.println("B from Sub: "+b);
	}
}

class MyIn1
{
	public static void main(String[] arg)
	{
		Sub x = new Sub();
		x.set();
		x.display();

		Super y = new Super();
		y.set();
		y.display();
	}
}
		