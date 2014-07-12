import java.awt.*;
import java.awt.event.*;
/*<applet code="PaintBrush" width=600 height=600>
</applet>
*/
class PaintBrush extends Frame implements ActionListener 
{
MenuBar mb;
MenuItem mi[]=new MenuItem[8];
Menu sh,col;
int x1,x2,y1,y2,count=0,pos=10;
boolean flag=false;
PaintBrush()
{
super("My Paint Window!!!");
setVisible(true);
setSize(500,500);
mb=new MenuBar();
sh=new Menu("Shapes");
col=new Menu("Colors");
mi[0]=new MenuItem("Circle");
mi[1]=new MenuItem("Ellipse");
mi[2]=new MenuItem("Square");
mi[3]=new MenuItem("Rectangle");
mi[4]=new MenuItem("Red");
mi[5]=new MenuItem("Green");
mi[6]=new MenuItem("Orange");
mi[7]=new MenuItem("Cyan");
sh.add(mi[0]);
sh.add(mi[1]);
sh.add(mi[2]);
sh.add(mi[3]);
col.add(mi[4]);
col.add(mi[5]);
col.add(mi[6]);
col.add(mi[7]);
mb.add(sh);
mb.add(col);
setMenuBar(mb);
for(int i=0;i<8;i++)
mi[i].addActionListener(this);
addMouseListener(new MouseAdapter (){
public void mouseClicked(MouseEvent me)
{
switch(count)
{
case 0:
x1=me.getX();
y1=me.getY();
if(pos==0||pos==2)
count=1;
else
count=2;
break;
case 1:
if(me.getX()>x1)
x2=me.getX()-x1;
else
x2=x1-me.getX();
y2=x2;
repaint();
break;
case 2:
if(me.getX()>x1)
x2=me.getX()-x1;
else
x2=x1-me.getX();
if(me.getY()>y1)
y2=me.getY()-y1;
else
y2=y1-me.getY();
repaint();
break;
default:break;
}
}
});
addWindowListener(new WindowAdapter (){
public void windowClosing(WindowEvent we)
{
setVisible(false);
}
});
}
public void actionPerformed(ActionEvent ae)
{
int n=8;
for(int i=0;i<8;i++)
if(ae.getSource()==mi[i])
n=i;
pos=n;
switch(n)
{
case 4:
setForeground(Color.red);
flag=true;
break;
case 5:
setForeground(Color.green);
flag=true;
break;
case 6:
setForeground(Color.orange);
flag=true;
break;
case 7:
setForeground(Color.cyan);
flag=true;
break;
default:break;
}
}
public void paint(Graphics g)
{
switch(pos)
{
case 0:
if(!flag)
{
g.drawOval(x1,y1,x2,y2);
}
else
g.fillOval(x1,y1,x2,y2);
count=0;
break;
case 1:
if(!flag)
g.drawOval(x1,y1,x2,y2);
else
g.fillOval(x1,y1,x2,y2);
count=0;
break;
case 2:
if(!flag)
g.drawRect(x1,y1,x2,y2);
else
g.fillRect(x1,y1,x2,y2);
count=0;
break;
case 3:
if(flag)
g.fillRect(x1,y1,x2,y2);
else
g.drawRect(x1,y1,x2,y2);
count=0;
break;
default:
count=0;
break;
}
}
public static void main(String args[])
{
Frame f=new PaintBrush();
f.setVisible(true);
f.setSize(500,500);
}
}