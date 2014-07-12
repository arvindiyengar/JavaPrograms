import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="KeyEvnt3" width=640 height=480>
</applet>
*/

public class KeyEvnt3 extends Applet implements KeyListener
{
	String msg="SEENU THE GREAT";
	int key,y=40,x=20;
	int len,i=0,s=x;

	public void init()
	{
		addKeyListener(this);
		len = msg.length();
	}
	
	public void update(Graphics g)
	{
		g.drawString(""+msg.charAt(i),x,y);
	}

	public void paint(Graphics g)
	{
		update(g);
	}

	public void keyPressed(KeyEvent ke)
	{
		i++;
		x = x+10;
		if(i==len)
		{
			i=0;
			x=s;
			y=y+20;
		}
		if(y>450)
		{
			s=s+160;
			x=s;
			y=40;
		}
		repaint();
	}

	public void keyReleased(KeyEvent ke)
	{
	}

	public void keyTyped(KeyEvent ke)
	{
	}
}