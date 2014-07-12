import java.io.*;
import java.lang.*;

class A
{
	private int a;
	protected int b;
	public int c;
	
	void setA()
	{
		a=10;
		b=20;
		c=30;
	}
	void dispA()	
	{
		System.out.println(a+"   "+b+"   "+c+"   ");
	}
}
class Inher1
{
	public static void main(String[] arg)
	{
		A x = new A();
		x.setA();
		x.dispA();
		//x.a = 15;
		x.b = 25;
		x.c = 35;
		x.dispA();
	}
}
