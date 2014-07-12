import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Cal" width=55000000 height=300>
</applet>
*/

public class Cal extends Applet implements ActionListener
{
String msg="";
int v1,v2,result,i;
TextField t1;
Button b[]=new Button[10];
Button add,sub,mul,div,clear,mod,eq;
char op;
public void init()
{
t1=new TextField(10);
GridLayout g=new GridLayout(4,5);
setLayout(g);
for(i=0;i<10;i++)
{
b[i]=new Button(""+i);
}
add=new Button("add");
sub=new Button("sub");
mul=new Button("mul");
div=new Button("div");
mod=new Button("mod");
clear=new Button("clear");
eq=new Button("eq");
t1.addActionListener(this);
add(t1);
for(i=0;i<10;i++)
{
add(b[i]);
}
add(add);
add(sub);
add(mul);
add(div);
add(clear);
add(mod);
add(eq);
for(i=0;i<10;i++)
{
b[i].addActionListener(this);
}
add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
mod.addActionListener(this);
clear.addActionListener(this);
eq.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
//char ch=str.charAt(0);
if(Character.isDigit(str[0]))
{
t1.setText(t1.getText()+str);
}
else if(str.equals("add"))
{
v1=Integer.parseInt(t1.getText());
op='+';
t1.setText("");
} 
else if(str.equals("eq"))
{
v2=Integer.parseInt(t1.getText());
if(op=='+')
{
result=v1+v2;}
}
t1.setText(""+result);
}

}
