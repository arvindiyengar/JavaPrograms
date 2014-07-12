import pA.*;
import pB.*;
import pC.*;

import java.io.*;


class A
{
	void show()
	{
		System.out.println("I am Local A...");
	}
}
class Pkg
{
	public static void main(String[] arg)
	{
		A a = new A();
		a.show();

		pA.A b = new pA.A();
		b.show();

		//B b = new B();

		pA.B c = new pA.B();
		c.show();

		pC.B f = new pC.B();
		f.show();

		C d = new C();
		d.show();

		D e = new D();
		e.show();

		//E x = new E();
	}
}
