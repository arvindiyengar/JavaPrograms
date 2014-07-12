import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MyFrame3" width=300 height=300>
</applet>
*/

class MyWindow extends Frame implements WindowListener,ActionListener
{
	Button b1;

	MyWindow()
	{
		addWindowListener(this);
		b1 = new Button("SubWindow1");
		b1.addActionListener(this);	
		add(b1);	

		setTitle("My First Window");
		setLayout(new FlowLayout());
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
		//System.exit(0);	
	}
}

class MySubWindow extends Frame implements WindowListener,ActionListener
{

	TextField Data;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	Button bdot,bback,bplus,bminus,bmul,bequal,bdiv,bcancel;
	Button bsqrt,bdivx,bsign;

	char Op ='=';
	double Ans = 0,Last=0;
	boolean text=false;

	MySubWindow()
	{
		setLayout(new BorderLayout());
		

		Data = new TextField(25);
		Data.setEditable(false);
		b0 = new Button(" 0 ");
		b1 = new Button(" 1 ");
		b2 = new Button(" 2 ");
		b3 = new Button(" 3 ");
		b4 = new Button(" 4 ");
		b5 = new Button(" 5 ");
		b6 = new Button(" 6 ");
		b7 = new Button(" 7 ");
		b8 = new Button(" 8 ");
		b9 = new Button(" 9 ");
		bdot = new Button(" . ");

		bback = new Button(" Back ");

		bplus = new Button(" + ");
		bminus = new Button(" - ");
		bmul = new Button(" * ");
		bdiv = new Button(" / ");
		bequal = new Button(" = ");
		bcancel = new Button(" C ");
		bsqrt = new Button(" Sqrt ");
		bdivx  = new Button(" 1/x ");
		bsign = new Button(" +/- ");

		Panel p1 = new Panel();
		p1.add(Data);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(5,4));
			
		p2.add(b0);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bdot);

		p2.add(bback);
		p2.add(bplus);
		p2.add(bminus);
		p2.add(bmul);
		p2.add(bdiv);
		p2.add(bequal);
		p2.add(bcancel);
		p2.add(bsqrt);
		p2.add(bdivx);
		p2.add(bsign);

		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bdot.addActionListener(this);
		bback.addActionListener(this);
		bplus.addActionListener(this);
		bminus.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bequal.addActionListener(this);
		bcancel.addActionListener(this);
		bdivx.addActionListener(this);
		bsqrt.addActionListener(this);
		bsign.addActionListener(this);



		addWindowListener(this);
		setTitle("My Calculator...");
		setSize(300,300);
		setVisible(true);
		setResizable(false);		
	}


	public void actionPerformed(ActionEvent ae)
	{
		String Cmd = ae.getActionCommand();

		if(Cmd.equals(" 1 "))
		{
			Data.setText(Data.getText()+"1");
		}
		else if(Cmd.equals(" 0 "))
		{
			Data.setText(Data.getText()+"0");
		}
		else if(Cmd.equals(" 2 "))
		{
			Data.setText(Data.getText()+"2");
		}
		else if(Cmd.equals(" 3 "))
		{
			Data.setText(Data.getText()+"3");
		}
		else if(Cmd.equals(" 4 "))
		{
			Data.setText(Data.getText()+"4");
		}
		else if(Cmd.equals(" 5 "))
		{
			Data.setText(Data.getText()+"5");
		}
		else if(Cmd.equals(" 6 "))
		{
			Data.setText(Data.getText()+"6");
		}
		else if(Cmd.equals(" 7 "))
		{
			Data.setText(Data.getText()+"7");
		}
		else if(Cmd.equals(" 8 "))
		{
			Data.setText(Data.getText()+"8");
		}
		else if(Cmd.equals(" 9 "))
		{
			Data.setText(Data.getText()+"9");
		}
		else if(Cmd.equals(" . "))
		{
			if(haveDot(Data.getText())==false)
				Data.setText(Data.getText()+".");
		}
		else if(Cmd.equals(" Back "))
		{
			if(Data.getText().equals("")==false)
			{
				String t = Data.getText();
				int len = t.length();
				Data.setText(t.substring(0,len-1));
			}
		}
		else if(Cmd.equals(" + "))
		{
			if(Data.getText().equals("")==false)
			{
				Ans = Last;				
				Last = Double.parseDouble(Data.getText());
				Data.setText("");
				doOperation();
				Op = '+';
			}
			System.out.println(Ans + "===" + Last);
			
		}
		else if(Cmd.equals(" - "))
		{
			if(Data.getText().equals("")==false)
			{
				Ans = Last;
				Last = Double.parseDouble(Data.getText());
				doOperation();
				Data.setText("");
				Op = '-';
			}
			System.out.println(Ans + "===" + Last);
		}
		else if(Cmd.equals(" * "))
		{
			if(Data.getText().equals("")==false)
			{
				Ans = Last;
				Last = Double.parseDouble(Data.getText());
				doOperation();
				Data.setText("");
				Op = '*';
			}
			System.out.println(Ans + "===" + Last);
		}
		else if(Cmd.equals(" / "))
		{
			if(Data.getText().equals("")==false)
			{
				Ans = Last;
				Last = Double.parseDouble(Data.getText());
				doOperation();
				Data.setText("");
				Op = '/';
			}
			System.out.println(Ans + "===" + Last);
		}
		else if(Cmd.equals(" = "))
		{
			if(Data.getText().equals("")==false)
			{
				Ans = Last;	
				Last = Double.parseDouble(Data.getText());
				doOperation();
				Op = '=';
			}
			Data.setText(""+Last);
			System.out.println(Ans + "===" + Last);
		}
		else if(Cmd.equals(" C "))
		{
			Ans = Last = 0;
			Op = '=';
			Data.setText("");
		}
		else if(Cmd.equals(" Sqrt "))
		{
			if(Data.getText().equals("")==false)
			{
				Last = Double.parseDouble(Data.getText());
				Last = Math.sqrt(Last);
				Data.setText(""+Last);
			}
		}
		else if(Cmd.equals(" 1/x "))
		{
			if(Data.getText().equals("")==false)
			{
				Last = Double.parseDouble(Data.getText());
				Last = 1/Last;
				Data.setText(""+Last);
			}
		}
		else if(Cmd.equals(" +/- "))
		{
			if(Data.getText().equals("")==false)
			{
				Last = Double.parseDouble(Data.getText());
				Last = -Last;
				Data.setText(""+Last);
			}
		}
	}
		
	boolean haveDot(String Str)
	{
		for(int i=0;i<Str.length();i++)
		{
			if(Str.charAt(i)=='.')
				return(true);
		}
		return(false);
	}

	void doOperation()
	{
		switch(Op)
		{
			case '+':	Last = Ans + Last;
				break;
			case '-':	Last = Ans - Last;
				break;
			case '*':	Last = Ans * Last;
				break;
			case '/':	Last = Ans / Last;
				break;
			case '=':	Last = Last;
				break;
		}
		Ans = 0;
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
		//System.exit(0);	
	}
}
public class MyFrame3 extends Applet implements ActionListener
{
	Button b1;
	public void init()
	{
		b1 = new Button("Calc");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		MyWindow m = new MyWindow();

	}
}