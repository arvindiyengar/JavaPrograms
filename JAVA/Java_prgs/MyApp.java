import java.awt.*;
import java.applet.*;

/*
<applet code="MyApp" width=300 height=300>
</applet>
*/

public class MyApp extends Applet
{
	public void init()
	{
		setForeground(Color.white);
		setBackground(Color.blue);
		System.out.println("Initiated...");
	}
	public void start()
	{
		System.out.println("Started...");
	}
	public void stop()
	{
		System.out.println("Stopped...");
	}
	public void destroy()
	{
		System.out.println("Destroy...");
	}
	public void paint(Graphics g)
	{
		System.out.println("Paint Called...");
		g.drawString("Welcome to Applet...",20,20);
	}

}