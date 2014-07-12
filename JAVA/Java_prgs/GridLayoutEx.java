import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="GridLayoutEx" width=550 height=600>
</applet>
*/

public class GridLayoutEx extends Applet implements ActionListener
{
	String msg="";
	Button c1,c2,c3,c4;
	Button[] b;
	TextArea c5;
	
	public void init()
	{
		GridLayout f = new GridLayout(3,7);
		
		setLayout(f);

		b = new Button[10];

		c1 = new Button("Chummaaaaa");
		c2 = new Button("Vetttteeeeeeee");
		c3 = new Button("Borrrrreeeeeee");
		c4 = new Button("Mudiyala..");

		

		add(c1);
		add(c2);
		add(c3);
		add(c4);

		for(int i=0;i<10;i++)
		{
			b[i] = new Button(""+i);
			add(b[i]);
		}

		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		
	}	

	public void actionPerformed(ActionEvent ie)
	{
		repaint();
	}

	public Insets getInsets()
	{
		return new Insets(10,10,10,10);
	}

	public void paint(Graphics g)
	{
	
	}

	
}