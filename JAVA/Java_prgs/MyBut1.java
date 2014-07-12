import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MyBut1" width=200 height=200>
</applet>
*/

public class MyBut1 extends Applet implements ActionListener
{
	TextField t1,t2;
	Button b1;

	public void init()
	{
		t1 = new TextField(10);
		t2 = new TextField(10);
		
		b1 = new Button("Copy");
		
		add(t1);
		add(t2);
	
		add(b1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String Cmd = ae.getActionCommand();

		if(Cmd.equals("Copy"))
		{
			String s;
			s = t1.getText();
			t2.setText(s);
		}
	}
		
	
	
}
