import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="BorderLayoutEx" width=250 height=200>
</applet>
*/

public class BorderLayoutEx extends Applet implements ItemListener
{
	String msg="";
	Checkbox c1,c2,c3,c4,c5;
	Button b1,b2;
	
	public void init()
	{
		setBackground(new Color(106,201,240));
		BorderLayout f = new BorderLayout(50,50);
		
		setLayout(f);


		c1 = new Checkbox("Chummaaaaa",null,true);
		c2 = new Checkbox("Vetttteeeeeeee");
		c3 = new Checkbox("Borrrrreeeeeee");
		c4 = new Checkbox("Mudiyala..");
		c5 = new Checkbox("Wasteeeeeee Layoutttttttttt..");

		b1 = new Button("OKKKKK");
		b2 = new Button("Cancel");

		
		add(c1,BorderLayout.NORTH);
		add(c2,BorderLayout.EAST);
		add(c3,BorderLayout.SOUTH);
		add(c4,BorderLayout.WEST);
		add(c5,BorderLayout.CENTER);
		//add(b1,BorderLayout.CENTER);
		//add(b2,BorderLayout.WEST);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
	}	

	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		msg = c1.getLabel()+" : " +c1.getState();
		g.drawString(msg,6,80);
		msg = c2.getLabel()+" : " +c2.getState();
		g.drawString(msg,6,100);
		msg = c3.getLabel()+" : " +c3.getState();
		g.drawString(msg,6,120);
		msg = c4.getLabel()+" : " +c4.getState();
		g.drawString(msg,6,140);
	}

	/*public Insets getInsets()
	{
		return new Insets(150,30,50,60);
	}*/
}