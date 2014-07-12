import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseEvnt1" width=400 height=400>
</applet>
*/

public class MouseEvnt1 extends Applet implements MouseListener, MouseMotionListener
{

	public void init()
	{
		Color maroon =new Color(0x80,50,0);
		setForeground(Color.blue);
		setBackground(maroon);

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse Clicked....");
	}

	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Mouse Entered....");
	}

	public void mouseExited(MouseEvent me)
	{
		System.out.println("Mouse Exited...");
	}
	
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Mouse Pressed...");
	}

	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse Released...");
	}

	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse Dragged...");
	}

	public void mouseMoved(MouseEvent me)
	{
		System.out.println("Mouse Moved...");
	}

	public void paint(Graphics g)
	{}
}
