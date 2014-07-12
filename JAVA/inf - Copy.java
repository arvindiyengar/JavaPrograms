import java.io.*;
class employee
{
int eno;
String ename,temp;
void input()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
ename=in.readLine();
temp=in.readLine();
eno=Integer.parseInt(temp);
}
void display()
{
System.out.println(""+ename+eno);
}
}
interface resume{
public void biodata();
}

class teacher extends employee implements resume
{
String qual,det;

void exp()
{
super.input();
DataInputStream in=new DataInputStream(System.in);
qual=in.readLine();
det=in.readLine();
}



public void biodata()
{
super.input();
super.display();
//System.out.println(""+qual+det);
}
}
class inf
{
public static void main(String args[])
{
teacher t=new teacher();
//t.exp();
t.biodata();
}
}
