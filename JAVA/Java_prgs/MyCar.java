import java.awt.*;
import java.applet.*;
/*
<applet code="MyCar" width=500 height=400>
</applet>
*/
public class MyCar extends Applet implements Runnable
{
	Thread t;
	Color maroon;
	int x=0,stx=20,sty=150;
	boolean test=true;

	public void init()
	{
		maroon =new Color(0x80,50,0);
		setForeground(Color.blue);
		setBackground(maroon);
	}
	public void paint(Graphics g)
	{
		g.drawRoundRect(stx+x,sty+20,200,30,10,10);
		g.fillOval(stx+20+x,sty+40,20,20);
		g.fillOval(stx+160+x,sty+40,20,20);
		g.drawLine(stx+50+x,sty,stx+150+x,sty);
		g.drawLine(stx+50+x,sty,stx+20+x,sty+20);
		g.drawLine(stx+150+x,sty,stx+180+x,sty+20);
		
	}
	public void start()
	{
		t=new Thread(this);	
		t.start();
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
				if(x>400)		
				x=5;
			}
			catch(Exception e)		
			{}
		}
	}
}