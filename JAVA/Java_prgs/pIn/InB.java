package pIn;

import java.io.*;

public class InB extends InA
{
	public void showPublic()
	{
		System.out.println("I am Public of InB");
		showPrivate();
		showFriendly();
		showProtected();

		//super.showPrivate();
		super.showFriendly();
		super.showProtected();
		super.showPublic();
	}
	private void showPrivate()
	{
		System.out.println("I am Private InB");
	}
	protected void showProtected()
	{
		System.out.println("I am Protected of InB");
	}
	void showFriendly()
	{
		System.out.println("I am Friendly of InB");
	}
}
