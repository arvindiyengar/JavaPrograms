import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MyCalc" width=200 height=200>
</applet>
*/

public class MyCalc extends Applet implements ActionListener
{
	TextField Data;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	Button bdot,bback,bplus,bminus,bmul,bequal,bdiv,bcancel;
	Button bsqrt,bdivx,bsign;

	char Op ='=';
	double Ans = 0,Last=0;
	boolean text=false;

	public void init()
	{
		Data = new TextField(23);
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

		add(Data);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(bdot);

		add(bback);
		add(bplus);
		add(bminus);
		add(bmul); 
		add(bdiv);
		add(bequal);
		add(bcancel);
		add(bsqrt);
		add(bdivx);
		add(bsign);

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
	
}
