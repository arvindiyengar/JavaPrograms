import java.awt.*;
import java.applet.*;

/*
<applet code="MyMov" width=300 height=300>
</applet>
*/

public class MyMov extends Applet implements Runnable
{
	Thread t;
	int x=20,y=20;
	boolean test=true;

	public void init()
	{
		setForeground(Color.white);
		setBackground(Color.blue);
		System.out.println("Initiated...");
	}
	public void start()
	{
		System.out.println("Started...");
		t = new Thread(this);
		t.start();	
	}
	public void stop()
	{
		test=false;
		System.out.println("Stopped...");
	}
	public void destroy()
	{
		System.out.println("Destroy...");
	}
	public void run()
	{
		while(test)
		{
			try
			{
				repaint();		
				Thread.sleep(200);
				x = x+10;
				if(x>300)
					x=20;
			}
			catch(InterruptedException e)
			{}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applet...",x,y);
	}

}