import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="cal1" width=300 height=300>
</applet>*/
public class cal1 extends Applet implements ActionListener
{
Button one,two,three,four,five,six,seven,eight,nine;
Button eq,ad,sub,div,mul;
double a,b,c;
Panel p1,p2;
char op;
String ts=" ";
String n1,n2,str;
TextField display=new TextField(" ",20);
public void init()
{
p1=new Panel();
setLayout(new BorderLayout());
one =new Button("1");
two =new Button("2");
three =new Button("3");
four =new Button("4");
five=new Button("5");
six =new Button("6");
seven =new Button("7");
eight =new Button("8");
nine =new Button("9");
eq=new Button("=");
mul=new Button("*");
div=new Button("/");
ad=new Button("+");
sub=new Button("-");
p2=new Panel();
p2.add(one);
p2.add(two);
p2.add(three);
p2.add(four);
p2.add(five);
p2.add(six);
p2.add(seven);
p2.add(eight);
p2.add(nine);
p2.add(ad);
p2.add(sub);
p2.add(mul);
p2.add(div);
p2.add(eq);
p2.setLayout( new GridLayout(4,4));
add(p2,BorderLayout.CENTER);
one.addActionListener(this);
two.addActionListener(this);
three.addActionListener(this);
four.addActionListener(this);
five.addActionListener(this);
six.addActionListener(this);
seven.addActionListener(this);
eight.addActionListener(this);
nine.addActionListener(this);
eq.addActionListener(this);
ad.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
p1.add(display);
add(p1,BorderLayout.NORTH);
display.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
str=ae.getActionCommand();
if(str.equals("1"))
{
ts=ts+"1";
display.setText(ts);
}
else if(str.equals("2"))
{
ts=ts+"2";
display.setText(ts);
}
else if(str.equals("3"))
{
ts=ts+"3";
display.setText(ts);
}
 else if(str.equals("4"))
{
ts=ts+"4";
display.setText(ts);
}
else if(str.equals("5"))
{
ts=ts+"5";
display.setText(ts);
}
else if(str.equals("6"))
{
ts=ts+"6";
display.setText(ts);
}
else if(str.equals("7"))
{
ts=ts+"7";
display.setText(ts);
}
else if(str.equals("8"))
{
ts=ts+"8";
display.setText(ts);
}
else if(str.equals("9"))
{
ts=ts+"9";
display.setText(ts);
}
else if(str.equals("+"))
{
n1=display.getText();
op='+';
ts=" ";
a=Double.parseDouble(n1.trim());
display.setText(ts);
}
else if(str.equals("-"))
{
n1=display.getText();
op='-';
ts=" ";
//a=Integer.parseInt(n1);

a=Double.parseDouble(n1.trim());
display.setText(ts);
}
else if(str.equals("*"))
{
n1=display.getText();
op='*';
ts=" ";
//a=Integer.parseInt(n1);

a=Double.parseDouble(n1.trim());
display.setText(ts);
}
else if(str.equals("/"))
{
op='/';
n1=display.getText();
ts=" ";
//a=Integer.parseInt(n1);
a=Double.parseDouble(n1.trim());
display.setText(ts);
}
else if(str.equals("="))
{
n2=display.getText();
String n3=" ";
ts=" ";
//b=Integer.parseInt(n2);
b=Double.parseDouble(n2);
switch(op)
{
case '+':
c=a+b;
break;
case '-':
c=a-b;
break;
case '*':
c=a*b;
break;
}
n3=n3+c;
display.setText(n3);
}
}
}