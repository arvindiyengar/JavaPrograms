import java.awt.*;
import java.awt.event.*;
import java.applet.*;



class Calc extends Frame implements ActionListener,KeyListener
{
	TextField Data;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	Button bdot,bback,bplus,bminus,bmul,bequal,bdiv,bcancel;
	Button bsqrt,bdivx,bsign;

	char Op ='=';
	double Ans = 0,Last=0;
	boolean text=false;
	Panel pn,pn1,pn2,pn3;

	String sq;

	Calc()
	{

		BorderLayout bl = new BorderLayout(20,20);
		setLayout(bl);
		
		pn = new Panel();
		pn.setLayout(new BorderLayout(10,10));		

		pn1 = new Panel();
		pn2 = new Panel();
		pn3 = new Panel();
		pn.add(pn1,BorderLayout.WEST);
		pn.add(pn2,BorderLayout.CENTER);
		pn.add(pn3,BorderLayout.SOUTH);

		pn1.setLayout(new GridLayout(3,4,5,5));
		pn2.setLayout(new GridLayout(4,3,5,5));
		pn3.setLayout(new GridLayout(1,2,5,5));


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
		bcancel = new Button(" Cancel ");
			sq=" "+(char)0x221A+" ";
		bsqrt = new Button(sq);
		bdivx  = new Button(" 1/x ");
		bsign = new Button(" +/- ");

		add(Data,BorderLayout.NORTH);
		add(pn,BorderLayout.CENTER);

		pn1.add(b0);
		pn1.add(b1);
		pn1.add(b2);
		pn1.add(b3);		
		pn1.add(b4);
		pn1.add(b5);
		pn1.add(b6);
		pn1.add(b7);
		pn1.add(b8);
		pn1.add(b9);
		pn1.add(bdot);
		pn1.add(bsign);

		
		pn2.add(bplus);
		pn2.add(bminus);
		pn2.add(bmul); 
		pn2.add(bdiv);
		pn2.add(bsqrt);
		pn2.add(bdivx);
		pn2.add(bequal);
		

		pn3.add(bback);
		pn3.add(bcancel);
		
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

		addKeyListener(this);
		//requestFocus();

setTitle("My First Window");
		setSize(300,300);
		setVisible(true);


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
		else if(Cmd.equals(" Cancel "))
		{
			Ans = Last = 0;
			Op = '=';
			Data.setText("");
		}
		else if(Cmd.equals(sq))
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

	public Insets getInsets()
	{
		return new Insets(10,10,10,10);
	}

	public void keyTyped(KeyEvent ke)
	{
		char c = ke.getKeyChar();
		System.out.println(""+c);
		if((int)c>=48 && (int)c<=57)
		{
			Data.setText(Data.getText()+""+c);
		}
	}
	public void keyPressed(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
	}

}
public class MyCalcWin
{
	public static void main(String[] st)
	{
		new Calc();
	}
}
