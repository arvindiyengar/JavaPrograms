import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="BorderInsetsEx" width=250 height=200>
</applet>
*/

public class BorderInsetsEx extends Applet implements ActionListener
{
	String msg="";
	Button c1,c2,c3,c4;
	TextArea c5;
	
	public void init()
	{
		
		BorderLayout f = new BorderLayout(50,50);
		
		setLayout(f);


		c1 = new Button("Chummaaaaa");
		c2 = new Button("Vetttteeeeeeee");
		c3 = new Button("Borrrrreeeeeee");
		c4 = new Button("Mudiyala..");
		c5 = new TextArea("Wasteeeeeee Layoutttttttttt..");
		
		add(c1,BorderLayout.NORTH);
		add(c2,BorderLayout.EAST);
		add(c3,BorderLayout.SOUTH);
		add(c4,BorderLayout.WEST);
		add(c5,BorderLayout.CENTER);

		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		//c5.addActionListener(this);
	}	

	public void actionPerformed(ActionEvent ie)
	{
		repaint();
	}

	public Insets getInsets()
	{
		return new Insets(100,300,100,300);
	}

	public void paint(Graphics g)
	{
	
	}

	
}