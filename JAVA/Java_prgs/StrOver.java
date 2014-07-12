import java.io.*;

class MyOver 
{
	public String toString()
	{
		return("Overridden toString()...");
	}
}

class MyClass
{
}

class StrOver
{
	public static void main(String[] arg)
	{
		MyClass m = new MyClass();
		System.out.println("MyClass: "+m);
		MyOver o = new MyOver();
		System.out.println("MyOver: "+o);	
	}
}
	
