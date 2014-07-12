import java.io.*;
class click implements Runnable
{
//int p;
Thread t;
int cl;
boolean check=true;
click(int p)
{
t=new Thread(this);
t.setPriority(p);
t.start();
}
public void run()
{
while(check)
{
cl++;
}
}
public void stop()
{
check=false;
}
}




class classpri
{
public static void main(String args[])
{
click hi=new click(Thread.NORM_PRIORITY+2);
click lo=new click(Thread.NORM_PRIORITY-2);
//lo.start();
//hi.start();

try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Error");
}

lo.stop();
hi.stop();

try
{
hi.t.join();
lo.t.join();
}
catch(InterruptedException e)
{
System.out.println("Error");
}
System.out.println("Low----"+lo.cl);
System.out.println("High"+hi.cl);
}
}