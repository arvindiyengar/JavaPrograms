import java.io.*;

class Zero
{
	int a;
	byte b;
	float c;
	double d;
	boolean e;
	
	void display()
	{
		a=10;
		b=20;
		c=20.5f;
		d=120.45;
		e=true;

/*		a=b;
		b=(byte)a;*/
		
/*		a=(int)c;
		c=a;*/

/*		d = a+b*c;/*

/*		c = (float)(a+b*c-d);*/

				
		System.out.println("Display Method...");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
}
class Third
{
	
	private static void main(String arg[])
	{
		System.out.println("Welcome....");
		Zero z=new Zero();
		z.display();
	}
	 void disp()
	{
		System.out.println("Display Method...");
		summa();
	}
	 void summa()
	{
		System.out.println("Summa...");
	}
}
