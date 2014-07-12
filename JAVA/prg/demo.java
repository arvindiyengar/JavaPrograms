import java.io.*;
 class demo
{
public static void main(String args[]) throws Exception
{
String temp="abc";
String s;
InputStream f=new FileInputStream("file1.txt");
OutputStream f1=new FileOutputStream("file2.txt");
int n=f.available();
System.out.println(n);

byte b[]=temp.getBytes();
int i;
for(i=0;i<b.length;i++)
{
System.out.println((char)b[i]);
}
}
}