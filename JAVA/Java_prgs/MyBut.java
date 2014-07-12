import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MyBut" width=200 height=200>
</applet>
*/

public class MyBut extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b1;

	public void init()
	{
		t1 = new TextField(23);
		t2 = new TextField(23);
		t3 = new TextField(23);
		
		b1 = new Button("Add");
		
		add(t1);
		add(t2);
		add(t3);

		add(b1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String Cmd = ae.getActionCommand();

		if(Cmd.equals("Add"))
		{
		}
	}
		
	
	
}
