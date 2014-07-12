import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="KeyEvnt2" width=400 height=400>
</applet>
*/

public class KeyEvnt2 extends Applet implements KeyListener
{
	String msg="";
	int key,y=40;

	public void init()
	{
		addKeyListener(this);
	}

	public void paint(Graphics g)
	{
		g.drawString("Key Event Example (Press Any Key)...",40,300);
		g.drawString(msg,10,y);
	}

	public void keyPressed(KeyEvent ke)
	{
		key = ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_ALT:
					msg = msg + "<Alt>";
					break;
			case KeyEvent.VK_CONTROL:
					msg = msg + "<Ctrl>";
					break;
			case KeyEvent.VK_UP:
					msg = msg + "<Up>";
					break;
			case KeyEvent.VK_DOWN:
					msg = msg + "<Down>";
					break;
			case KeyEvent.VK_LEFT:
					msg = msg + "<Left>";
					break;
			case KeyEvent.VK_RIGHT:
					msg = msg + "<Right>";
					break;
		}
		repaint();		
		//showStatus("Key Pressed...");
	}

	public void keyReleased(KeyEvent ke)
	{
		//showStatus("Key Released...");
	}

	public void keyTyped(KeyEvent ke)
	{
		char c;
		c = ke.getKeyChar();
		msg = msg + c;
		repaint();
		//showStatus("Key Typed...");
	}
		
	
}