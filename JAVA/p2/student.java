package p2;
public  class student
{
int regno;
String name,course,branch;
int yos;
public void getdata(int no,String pname,String br,String crse,int year)
{
regno=no;
name=pname;
branch=br;
course=crse;
yos=year;
}
public void display()
{
System.out.println(""+name+regno+course+yos);
}
}
