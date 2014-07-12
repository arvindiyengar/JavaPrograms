import java.applet.*;
impoet java.awt.*;
import java.awt.event.*;
<applet code="ProgressReport" width=200 height=200></applet>
public class ProgressReport extende Applet implements Action Listener
{
String s;
int a;
TextArea ta1;
Textbox ta2[];
Button b,b1;
Label l1=new Label("Enter your name");
Label l3=new Label("Enter Subject marks");
b=new Button("submitt");
public void init()
{
ta1=new TextArea();
add(l1);
add(ta1);
add(b);
b.addActionListener(this);
}
public void actionPerformed(Action Event ae)
{
s=ta1.getText();
a=Integer.parseInt(s);
add(l3);
for(int i=0;i<a;i++)
{
bta2[i]=new TextArea("text" + i);
add(b[i]);
}
}
}

