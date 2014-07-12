import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="SRF" width=350 height=800>
</applet>
*/

public class SRF extends Applet implements ActionListener
{
	Label title;
	Label[] l = new Label[13];
	TextField tName,tRno,branch,add1,add2,email;
	TextArea extra,sum;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	CheckboxGroup cg;
	
	Choice deg,yos,dd,mm,yy;
	Button next;
	Label tt = new Label("");
	
	public void init()
	{
		setBackground(new Color(135,206,250));
		
		title = new Label("Students Responce Form");

		title.setBackground(new Color(255,255,255));

		//setLayout(new BorderLayout());

		Panel p1 = new Panel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.add(title);
		
		//add(p1,BorderLayout.NORTH);
		
		Panel p2 = new Panel();
		//p2.setMaximumSize(new Dimension(50,300));
		//p2.setMinimumSize(new Dimension(1000,500));
		p2.setLayout(new GridLayout(12,0,40,10));		
		//p2.add(new Checkbox("VS"));
		//add(p2,BorderLayout.CENTER);

		l[0] = new Label("Name:");
		//l[0].setSize(150);
		l[1] = new Label("Reg No: ");
		l[2] = new Label("Gender: ");
		l[3] = new Label("Degree: ");
		l[4] = new Label("Branch: ");
		l[5] = new Label("of Study: ");
		l[6] = new Label("Date of Birth: ");
		l[7] = new Label("Address-1: ");
		l[8] = new Label("Address-2: ");
		l[9] = new Label("Email: ");
		l[10] = new Label("Hobby: ");
		l[11] = new Label("Extracurricular Activities: ");
		l[12] = new Label("Details of Student: ");
		
		tName = new TextField(30);
		tRno = new TextField(30);
		
		cg = new CheckboxGroup();
		c1 = new Checkbox("Male          ",true,cg);
		c2 = new Checkbox("Female        ",false,cg);

		deg = new Choice();
		yos = new Choice();
		
		branch =  new TextField(30);

		dd = new Choice();
		mm = new Choice();
		yy = new Choice();

		add1 = new TextField();
		add2 = new TextField();

		email = new TextField();

		c3 = new Checkbox("Facebook       ");
		c4 = new Checkbox("Watching Movie ");
		c5 = new Checkbox("Watching Serial");
		c6 = new Checkbox("Chatting       ");
		c7 = new Checkbox("Video Games    ");
		c8 = new Checkbox("Outdoor Games  ");
		c9 = new Checkbox("Indoor Games   ");
		c10 = new Checkbox("Reading Novel ");

		extra = new TextArea(5,30);
		
		next = new Button("Next");

		sum = new TextArea(10,50);

		
		add(l[0]);
			add(tName);
		

		add(l[1]);
			add(tRno);
		
		add(l[2]);
			//Panel p21 = new Panel();	
			add(c1); add(c2);
			//p2.add(p21);
		add(l[3]);	
			add(deg);  
			deg.add("M.Tech       ");
			deg.add("B.Tech       ");
			deg.add("M.C.A        ");

		add(l[4]);
			add(branch);
		add(l[5]);
			add(yos);
			for(int i=1983;i<=2016;i++)
				yos.add(i+"    ");

		add(l[6]);
			//Panel p22 = new Panel();
			//add(p22);
			add(dd);
			for(int i=1;i<=31;i++)
				dd.add(i+" ");
			add(mm);
			for(int i=1;i<=12;i++)
				mm.add(i+"    ");
			add(yy);
			for(int i=1933;i<=2016;i++)
				yy.add(i+"    ");
		add(l[7]);
			add(add1);

		add(l[8]);
			add(add2);

		add(l[9]);
			add(email);
		add(l[10]);
			//Panel p23 = new Panel();
			//p2.add(p23);
			//setLayout(new GridLayout(3,3,5,5));
			add(c3);	add(c4);	add(c5);
			add(c6);	add(c7);	add(c8);
			add(c9);	add(c10);

		add(l[11]);
			add(extra);
		
		add(next);
		
		add(l[12]);
			add(sum);
	}

/*	public Insets getInsets()
	{
		return new Insets(10,300,10,300);
	}
*/
	public void actionPerformed(ActionEvent ae)
	{
		String Cmd = ae.getActionCommand();

		
	}
		

}
