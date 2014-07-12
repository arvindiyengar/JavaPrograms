import java.net.*;
import java.util.*;
import java.io.*;

class Clientdemo
{
public static void main(String args[])
{
try
{
//int port=Integer.parseInt(args[0]);
//ServerSocket ss=new ServerSocket(port);

int port=121;
Socket s=new Socket("Local Arvind",port);
InputStream os=s.getInputStream();
DataInputStream dos=new DataInputStream(os);
int a=dos.readInt();
System.out.println("Num received"+a);
s.close();
}
catch(Exception e)
{
System.out.println("Excep"+e);
}
}
}