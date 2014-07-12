import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class MyWindow extends Frame implements WindowListener,ActionListener
{
	Button b1,b2;

	MyWindow()
	{
		addWindowListener(this);
		b1 = new Button("SubWindow1");
		b1.addActionListener(this);	
		add(b1);	

		b2 = new Button("SubWindow2");
		b2.addActionListener(this);	
		add(b2);	
		

		setTitle("My First Window");
		//setLayout(new FlowLayout());
		setSize(300,300);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.drawString("My First Window",20,200);
	}

	public void actionPerformed(ActionEvent e)
	{
		MySubWindow m = new MySubWindow();	
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

class MySubWindow extends Frame implements WindowListener
{
	MySubWindow()
	{
		addWindowListener(this);
		setTitle("Sub Window");
		setSize(300,300);
		setVisible(true);		
	}

	public void paint(Graphics g)
	{
		g.drawString("My Sub Window",20,20);
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
public class MyFrame2 
{
	public static void main(String[] arg)
	{
		MyWindow m = new MyWindow();

		
	}
}