import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class MenuFrame extends Frame implements WindowListener
{
	MenuBar mb;
	
	MenuFrame()
	{
		mb = new MenuBar();
		setMenuBar(mb);

		Menu file = new Menu("File");
		MenuItem m1,m2,m3,m4,m5;
		m1 = new MenuItem("New...");
		m2 = new MenuItem("Open...");
		m3 = new MenuItem("Save...");
		m4 = new MenuItem("-");
		m5 = new MenuItem("Exit...");

		file.add(m1);
		file.add(m2);
		file.add(m3);
		file.add(m4);
		mb.add(file);


		setTitle("Menu Bar Example...");
		setSize(300,300);
		setLayout(new FlowLayout());
		setVisible(true);
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

public class MyMenu 
{
	public static void main(String[] arg)
	{
		new MenuFrame();
	}
}