import pIn.*;
import java.io.*;

class MyInA extends InA
{
	void showLocal()
	{
		showPublic();
		showProtected();
		/*showPrivate();
		showFriendly();*/
	}
}

class MyInP
{
	public static void main(String[] arg)
	{
		System.out.println("\nThrough Direct ObJect of InA..");
		InA a = new InA();
		
		a.showPublic();
		/*a.showProtected();
		a.showPrivate();
		a.showFriendly();*/

		System.out.println("\nThrough Local SUB of InA..");
		MyInA b = new MyInA();
		b.showLocal();

		System.out.println("\nThrough pIn SUB of InA..");
		InB c = new InB();
		c.showPublic();
		/*c.showProtected();
		c.showPrivate();
		c.showFriendly();*/
		
	}
}
