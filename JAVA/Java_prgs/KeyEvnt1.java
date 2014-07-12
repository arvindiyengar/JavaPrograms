import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="KeyEvnt1" width=400 height=400>
</applet>
*/
public class KeyEvnt1 extends Applet implements KeyListener
{

	public void init()
	{
		addKeyListener(this);
	}

	public void paint(Graphics g)
	{
		g.drawString("Key Event Example (Press Any Key)...",40,40);
		g.drawString("Status Bar Parunga pa...",40,60);
	}

	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Pressed...");
	}

	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Released...");
	}

	public void keyTyped(KeyEvent ke)
	{
		showStatus("Key Typed...");
	}
		
	
}