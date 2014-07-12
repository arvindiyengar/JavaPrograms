import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MyFrame1" width=300 height=300>
</applet>
*/
class MyWindow extends Frame implements WindowListener
{
	MyWindow()
	{
		addWindowListener(this);
		setTitle("My First Window");
		setSize(300,300);
		setVisible(true);		
	}

	public void paint(Graphics g)
	{
		g.drawString("My First Window",20,20);
	}

	public void windowClosed(WindowEvent e)
	{}
	public void windowOpened(WindowEvent e)
	{}
	public void windowActivated(WindowEvent e)
	{}
	public void windowDeactivated(WindowEvent e)
	{}
	public void windowIconified(WindowEvent e)
	{}
	public void windowDeiconified(WindowEvent e)
	{}
	public void windowClosing(WindowEvent e)
	{
		setVisible(false);
		System.exit(0);	
	}
}


public class MyFrame1 
{
	public static void main(String args[])
	{
		MyWindow m = new MyWindow();
		
	}
}