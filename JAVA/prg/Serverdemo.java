import java.net.*;
import java.util.*;
import java.io.*;

class Serverdemo
{
public static void main(String args[])
{
try
{
int port=Integer.parseInt(args[0]);
ServerSocket ss=new ServerSocket(port);
Socket s=ss.accept();
OutputStream os=s.getOutputStream();
DataOutputStream dos=new DataOutputStream(os);
dos.writeInt(1254689632);
s.close();
}
catch(Exception e)
{
System.out.println("Excep"+e);
}
}
}