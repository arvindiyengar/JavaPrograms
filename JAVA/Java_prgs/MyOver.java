import java.io.*;

class Overload
{
	void arrange(int[] a)
	{
		int i,j,t;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	void arrange(String[] a)
	{
		int i,j;
		String t;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[j].compareTo(a[i])<0)
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	void arrange(String a)
	{
		int i,j;
		char t;
		char x[]=a.toCharArray();
		for(i=0;i<x.length;i++)
		{
			for(j=i+1;j<x.length;j++)
			{
				if(x[j]<x[i])
				{
					t=x[i];
					x[i] = x[j];
					x[j] = t;	
				}
			}
		}
		System.out.println(x);
	}
}

class MyOver
{
	public static void main(String[] arg)
	{
		Overload x = new Overload();

		int[] a = {5,21,34,12,57,18};
		x.arrange(a);
		System.out.println("\nFor Integers: ");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

		String[] b = {"elango","raja","Srini"};
		x.arrange(b);
		System.out.println("\nFor Strings: ");
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);

		x.arrange(b[1]);

	}
}
		

		
	