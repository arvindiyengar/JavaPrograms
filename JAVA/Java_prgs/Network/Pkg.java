import RMI.pA.*;
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

		RMI.pA.A b = new RMI.pA.A();
		b.show();

		//B b = new B();

		RMI.pA.B c = new RMI.pA.B();
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
