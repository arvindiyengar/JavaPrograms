import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="FlowLayoutEx" width=250 height=200>
</applet>
*/

public class FlowLayoutEx extends Applet implements ItemListener
{
	String msg="";
	Checkbox c1,c2,c3,c4;
	
	public void init()
	{
		
		FlowLayout f = new FlowLayout(FlowLayout.RIGHT,50,10);
		
		setLayout(f);


		c1 = new Checkbox("Chummaaaaa",null,true);
		c2 = new Checkbox("Vetttteeeeeeee");
		c3 = new Checkbox("Borrrrreeeeeee");
		c4 = new Checkbox("Mudiyala..");
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
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
}