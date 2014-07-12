import p1.*;
import p2.*;
public class pkg
{
public static void main(String args[])
{
p1.student s1=new p1.student();
p2.student s2=new p2.student();
s1.getdata(5,"Arvi","ICT","Btech",2);
s2.getdata(6,"Abhi","CSE","MCA",3);
s1.display();
s2.display();
}
}
