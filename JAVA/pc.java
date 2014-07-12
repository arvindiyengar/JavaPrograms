import java.io.*;
class Q
{
 int n;
boolean value=false;
synchronized void get()
 {
 if(!value)
 {
 try
 {
 wait();
 }
 catch(InterruptedException e)
 {
 System.out.println("Error");
 }
 }
System.out.println("Get:"+n);
value=false;
notify();


 }

synchronized void put(int n)
{
if(value)
{
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println("Error");
}
}
this.n=n;
value=true;
System.out.println("Put"+n);
notify();


}
}

class Producer implements Runnable
{
Q q1;
Thread t;
Producer(Q q)
{
q1=q;
t=new Thread(this,"Pro");
t.start();
}

public void run()
{
int i=0;
while(true)
{
q1.put(i++);
}
}
}
class Consumer implements Runnable
{
Q q1;
Thread t;
Consumer(Q q)
{
q1=q;
t=new Thread(this,"Cons");
t.start();
}
public void run()
{

while(true)
{
q1.get();
}
}
}
class pc
{
public static void main(String args[])
{
Q q=new Q();

new Producer(q);
new Consumer(q);
}
}


