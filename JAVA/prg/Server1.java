import java.net.*;
import java.util.*;
import java.io.*;

class server1
{
public static void main(String args[])
{
ServerSocket ss=new ServerSocket(777);
Socket S=ss.accept();
System.out.println("Conn establish");
PrintStream ps=new PrintStream();
String str="Hello Client";
ps.println(str);
ps.println("Bye");
s.close();
ss.close();
ps.close();
}
}
