
class A
{
	private int a;
	A()
	{
		System.out.println("Object Created With No Argument..");
	}
	A(int x)
	{
		a = x;
		System.out.println("Object Created With "+x);
	}
	void disp()
	{
		System.out.println("Hai: a="+a);
	}
	protected void finalize() throws Throwable
	{
		System.out.println("Object "+a+" is Deleted...");
	}
}


class Program
{
	public static void main(String[] args)
	{
		A m,n;
		m = new A(3);
		n = new A(6);
		m = n;
		new A(9);
		System.gc();
		m = null;
		n = null;
		System.gc();
		for(long i=0;i<100000000L;i++);
	
	}
}
