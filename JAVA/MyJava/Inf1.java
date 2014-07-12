interface A
{
	void display();
}
class B implements A
{
	void show()
	{
		System.out.println("Am Show of B");
	}
	public void display()
	{
		System.out.println("Am Display of B");
	}
}
class C implements A
{
	void show()
	{
		System.out.println("Am Show of C");
	}
	public void display()
	{
		System.out.println("Am Display of C");
	}
}
class Inf1 
{
	public static void main(String[] arg)
	{
		B n = new B();
		n.show();
		n.display();

		C m = new C();
		m.show();
		m.display();

		A p;
		//p = new A();
		p = new B();
		p.display();
		//p.show();
		p = new C();
		p.display();
	}
}