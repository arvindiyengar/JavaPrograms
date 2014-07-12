interface A
{
	void display();
}
interface Z
{
	void display();
	void display(int x);
}
interface X extends A
{
	void disp();
}
class B implements A,Z
{
	void show()
	{
		System.out.println("Am Show of B");
	}
	public void display()
	{
		System.out.println("Am Display of B");
	}
	public void display(int x)
	{
		System.out.println("Am Display of B-"+x);
	}
}
class C implements A,Z
{
	void show()
	{
		System.out.println("Am Show of C");
	}
	public void display()
	{
		System.out.println("Am Display of C");
	}
	public void display(int x)
	{
		System.out.println("Am Display of C-"+x);
	}
	/*public int display(int x)
	{
	}*/
	public void display(int x,int y)
	{
		System.out.println("Am Display of C-"+x+"-"+y);	
	}
}
abstract class E implements Z
{
	abstract public void display();	
	public void display(int x)
	{}
}

class Inf2 
{
	public static void main(String[] arg)
	{

		Z p;
		//p = new A();
	
		p = new B();
		p.display();
		p.display(5);
		//int d = p.display(55);		
	

		p = new C();
		p.display();
		p.display(10);
		//p.display(1,2); 
		
		C q = new C();
		q.display(8,9);	

		//E e = new E();
		//e.display();	
	}
}