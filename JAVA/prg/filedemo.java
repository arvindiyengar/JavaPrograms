import java.io.*;
class filedemo
{
public static void main(String args[]) throws Exception
{
InputStream f=new FileInputStream("file1.txt");
OutputStream fo=new FileOutputStream("file2.txt");
String src;
int i,c;
int n=f.available();
//byte b=new byte[1024];
/*for(i=0;i<n;i++)

{
c=f.read(b);
fo.write(b);
}
*/
System.out.println(n);
fo.close();
f.close();
}
}
