import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="srf" width=500 height=500 >
</applet>
*/
public class srf extends Applet implements ActionListener
{

 int i; 
 Label abc[]=new Label[8];
 TextField t1,t2;
 Panel p[]=new Panel[8];
 Button b;
 Checkbox m,f;
 CheckboxGroup cg;
 List h;
 TextArea ta;
 Choice c[]=new Choice[6];
 public void init()
  {
	abc[0]=new Label("Name");
	abc[1]=new Label("Reg No");
	abc[2]=new Label("Gender");
	abc[3]=new Label("Degree");
	abc[4]=new Label("YOS");
	abc[5]=new Label("Branch");
	abc[6]=new Label("DOB");
	abc[7]=new Label("Hobby");
	for(i=0;i<8;i++)
	{
		p[i]=new Panel();
		add(p[i]);
		p[i].add(abc[i]);
	}
	t1=new TextField(20);
	p[0].add(t1);
	t2=new TextField(20);
	p[1].add(t2);
	cg= new CheckboxGroup();
	m=new Checkbox("Male",cg,true);
	f=new Checkbox("Female",cg,false);
	p[2].add(m);
	p[2].add(f);
	for(i=0;i<6;i++)
	{
	c[i]=new Choice();
	}
	c[0].add("Btech");
	c[0].add("Mtech");
	p[3].add(c[0]);
	c[1].add("I");
	c[1].add("II");
	p[4].add(c[1]);
	c[2].add("IT");
	c[2].add("CSE");
	p[5].add(c[2]);
	c[3].add("Jan");
	c[3].add("Feb");
	c[4].add("1");
	c[4].add("2");
	c[5].add("1993");
	c[5].add("1994");
	p[6].add(c[3]);
	p[6].add(c[4]);
	p[6].add(c[5]);
	h=new List();
	h.add("Playing");
	h.add("Reading");
h.setMultipleMode(true);
	p[7].add(h);
	b=new Button("Submit");
	add(b);
	b.addActionListener(this);
	ta=new TextArea(" ",20,30,TextArea.SCROLLBARS_BOTH);
	add(ta);
}
public void actionPerformed(ActionEvent ae)
{
String msg=" ";
msg+="Name"+t1.getText()+"\n";
msg+="RegNo"+t2.getText()+"\n";
ta.setText(msg);
}

}

