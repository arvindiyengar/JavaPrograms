import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MyBut2" width=200 height=200>
</applet>
*/

public class MyBut2 extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b1,b2;

	public void init()
	{
		t1 = new TextField(23);
		t2 = new TextField(23);
		t3 = new TextField(23);
		
		b1 = new Button("Add");
		b2 = new Button("Sub");
		
		add(t1);
		add(t2);
		add(t3);

		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String Cmd = ae.getActionCommand();
			double a,b,c=0;
			String s1,s2;
			s1 = t1.getText();
			s2 = t2.getText();
			a = Double.parseDouble(s1);
			b = Double.parseDouble(s2);
		if(Cmd.equals("Add"))
			c = a + b;	
		else if(Cmd.equals("Sub"))
			c = a - b;

			t3.setText(""+c);

	}
		
	
	
}
