import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseEvnt2" width=400 height=400>
</applet>
*/

public class MouseEvnt2 extends Applet implements MouseListener, MouseMotionListener
{
	String msg = "";
	int mx=0,my=0;
	
	public void init()
	{
		Color c = new Color(0x80,0,0);
		addMouseListener(this);
		addMouseMotionListener(this);

		setBackground(c);
		setForeground(Color.white);
	}

	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse Clicked....");
		msg = "Clicked...";
		mx = 10;
		my = 20;
		repaint();
	}

	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Mouse Entered....");
		msg = "Entered...";
		mx = 10;
		my = 20;
		repaint();
	}

	public void mouseExited(MouseEvent me)
	{
		System.out.println("Mouse Exited...");
		msg = "Exited...";
		mx =10;
		my = 20;
		repaint();		
	}
	
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Mouse Pressed...");
		msg = "Down...";
		mx = me.getX();
		my = me.getY();
		repaint();		
	}

	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse Released...");
		msg = "Up...";
		mx = me.getX();
		my = me.getY();
		repaint();		
	}

	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse Dragged...");
		msg = "SEENU";
		mx = me.getX();
		my = me.getY();
		showStatus("Dragging at " + mx + "," + my);
		repaint();		
	}

	public void mouseMoved(MouseEvent me)
	{
		showStatus("Dragging at " + me.getX() + "," + me.getY());
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,mx,my);
	}
}
