import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;



public class StuDataBase extends Frame implements ActionListener
{
	Label title;
	Label[] l = new Label[5];
	TextField tName,tRno,branch,cg,year;
	Connection conn;
	Statement st;
	ResultSet rs;

	Button next,pre,first,last,ad,update,exit,ins,del;

	public void showText() throws Exception
	{
		tName.setText(rs.getString(1));
		tRno.setText(rs.getString(2));
		branch.setText(rs.getString(3));	
		cg.setText(rs.getString(4));
		year.setText(rs.getString(5));
	}
	public StuDataBase() throws Exception
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));

		setBackground(new Color(135,206,250));
		
		title = new Label("                         Students Responce Form              ");

		title.setBackground(new Color(255,255,255));

		add(title);
		
		l[0] = new Label("Name:");
		l[1] = new Label("Reg No: ");
		l[2] = new Label("Branch: ");
		l[3] = new Label("Year: ");
		l[4] = new Label("CGPA: ");

		tName = new TextField(30);
		tRno = new TextField(30);
		branch =  new TextField(30);
		cg =  new TextField(30);		
		year =  new TextField(30);

		next = new Button("Next");
		pre = new Button("Previous");
		first = new Button("First");
		last = new Button("Last");
		ad = new Button("Clear");
		ins = new Button("Add");
		exit = new Button("Exit");
		update = new Button("Update");
		del = new Button("Delete");
		
		next.addActionListener(this);
		pre.addActionListener(this);
		first.addActionListener(this);
		last.addActionListener(this);
		ad.addActionListener(this);
		update.addActionListener(this);
		exit.addActionListener(this);
		del.addActionListener(this);
		ins.addActionListener(this);
	
		add(l[0]);
			add(tName);
	

		add(l[1]);
			add(tRno);	tRno.setEnabled(false);
		
		add(l[2]);
			add(branch);

		add(l[3]);	
			add(cg);

		add(l[4]);
			add(year);

		add(first);
		add(pre);
		add(next);
		add(last);
		add(ad);
		add(ins);
		add(update);
		add(del);
		add(exit);
		

		Class.forName("com.mysql.jdbc.Driver");
     		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
      	
    		st = conn.createStatement();
    		rs = st.executeQuery("SELECT * FROM stu");

		if(rs.next()==true)
		{
			showText();
		}
		
			
	}

	public void actionPerformed(ActionEvent ae) 
	{
		String Cmd = ae.getActionCommand();
	    try
	    {
		if(Cmd.equals("Exit"))
			System.exit(0);
		else if(Cmd.equals("Next"))
		{
			if(rs.next()==true)
				showText();
		}
		else if(Cmd.equals("Previous"))
		{
			if(rs.previous()==true)
				showText();
		}
		else if(Cmd.equals("First"))
		{
			if(rs.first()==true)
				showText();
		}
		else if(Cmd.equals("Last"))
		{
			if(rs.last()==true)
				showText();
		}
		else if(Cmd.equals("Clear"))
		{
			tRno.setEnabled(true);
			tName.setText("");
			tRno.setText("");
			branch.setText("");	
			cg.setText("");
			year.setText("");
			tName.requestFocus();			
		}
		else if(Cmd.equals("Add"))
		{
			String[] a = new String[5];
			a[0] = tName.getText();
			a[1] = tRno.getText();
			a[2] = branch.getText();
			a[3] = cg.getText();
			a[4] = year.getText();
			for(int i=0;i<5;i++)
				if(a[i].equals(""))
					return;
			int rn,yr;
			float c;
			rn = Integer.parseInt(a[1]);
			yr = Integer.parseInt(a[4]);
			c = Float.parseFloat(a[3]);
			
			st.executeUpdate("insert into stu values("+a[0]+","+rn+","+a[2]+","+yr+","+c+")");

			rs = st.executeQuery("Select * from stu");

			
			if(rs.first()==true)
				showText();
			tRno.setEnabled(false);			
		}
		else if(Cmd.equals("Delete"))
		{
			String a;
			a = tRno.getText();

			int i;
			i = Integer.parseInt(a);

			st.executeUpdate("delete from stu where Rno="+i+"");

			rs = st.executeQuery("Select * from stu");

			
			if(rs.first()==true)
				showText();
			tRno.setEnabled(false);			
		}

	     }
	     catch(Exception e)
	     {}		
	}
		
	public static void main(String[] arg) throws Exception
	{
		StuDataBase sdb = new StuDataBase();
		sdb.setVisible(true);
		sdb.setSize(330,420);
	}
}
