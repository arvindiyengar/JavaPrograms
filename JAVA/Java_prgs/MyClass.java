import java.io.*;

class Class1
{
	private int no;
	private String name;
	private double sal;

	Class1()
	{
		no = 101;
		name = "Srini";
		sal = 10000;
	}

	Class1(int no, String name, double sal)
	{
		this.no = no;
		this.name = name;
		this.sal = sal;
	}

	Class1(Class1 t)
	{
		t.no = 103;
		t.name="I AM C";
		t.sal=10001;
		no=111;
		name="iamd";
		sal=101;
	}

	void change(int noA, String nameA, double salA)
	{
		no = noA;
		this.name = nameA;
		this.sal = sal;
	}

	void display()
	{
		System.out.println("No: "+no);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
	}
	
}

class MyClass
{
	public static void main(String[] arg)
	{
		Class1 a = new Class1();

		System.out.println("\nA Details: ");
		a.display();

		Class1 b;
		b=a;

		System.out.println("\nB Details: ");
		b.display();

		b.change(102,"NewName",20000);

		System.out.println("\nAfter Changing B: ");
		System.out.println("\nA Details: ");
		a.display();
		System.out.println("\nb Details: ");
		b.display();


		Class1 c = new Class1(102,"I AM C",15000);
		System.out.println("\nNew Class C is Created...");
		System.out.println("\nC Details: ");
		c.display();

		Class1 d = new Class1(c);
		System.out.println("\nNew Class D is Created...");
		System.out.println("\nC Details: ");
		c.display();
		System.out.println("\nD Details: ");
		d.display();


	}
}