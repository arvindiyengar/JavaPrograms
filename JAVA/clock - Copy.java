import java.awt.*;
import java.applet.*;
/*
<applet code="clock" width=500 height=500>
</applet>
*/
public class clock extends Applet implements Runnable
{
	Thread t;
	int x,y,flag,flag1,flag2,a,b,c,d;
	boolean sflag,mflag,hflag;
	public void init()
	{
		flag=1;
		flag1=1;
		flag2=1;
		mflag=false;	
		sflag=true;
		hflag=false;
		x=150;
		y=0;
		a=150;
		b=0;
		c=150;
		d=0;
		t=new Thread(this,"rotate");
		t.start();
	}
	public void start()
	{
		sflag=true;
	}
	public void run()
	{
		while(sflag)
		{
			try
			{
				t.sleep(1000);
				if(flag==1)
				{
					x+=10;
					y+=10;
					if(x==300&&y==150)
						flag=2;
				}
				else if(flag==2)
				{
					x-=10;
					y+=10;
					if(x==150&&y==300)
						flag=3;
				}
				else if(flag==3)
				{
					x-=10;
					y-=10;
					if(x==0&&y==150)
						flag=4;
				}
				else if(flag==4)
				{
					x+=10;
					y-=10;
					if(x==150&&y==0)
					{
						flag=1;
						mflag=true;
					}
				}
//				System.out.println("!!!!!!");
			}	
			catch(InterruptedException e)	{}
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("12",150,10);
		g.drawString("3",290,150);
		g.drawString("6",150,295);
		g.drawString("9",5,150);
		g.drawOval(0,0,300,300);
		g.setColor(Color.red);
		g.drawLine(150,150,x,y);
		if(mflag)
		{
			min();
			mflag=false;
		}
		g.setColor(Color.blue);
		g.drawLine(150,150,a,b);
		if(hflag)
		{
			hr();
			hflag=false;
		}
		g.setColor(Color.green);
		g.drawLine(150,150,c,d);
		showStatus(""+x+","+y);
	}
	/*public void stop()
	{
		sflag=false;
	}*/
	public void min()
	{
		if(flag1==1)
		{
			a+=10;
			b+=10;
			if(a==300&&b==150)
				flag1=2;
		}
		else if(flag1==2)
		{
			a-=10;
			b+=10;
			if(a==150&&b==300)
				flag1=3;
		}
		else if(flag1==3)
		{
			a-=10;
			b-=10;
			if(a==0&&b==150)
				flag1=4;
		}
		else if(flag1==4)
		{
			a+=10;
			b-=10;
			if(a==150&&b==0)
			{
				flag1=1;
				hflag=true;
			}
		}
	}
	public void hr()
	{
		if(flag2==1)
		{
			c+=10;
			d+=10;
			if(c==300&&d==150)
				flag2=2;
		}
		else if(flag2==2)
		{
			c-=10;
			d+=10;
			if(c==150&&d==300)
				flag2=3;
		}
		else if(flag2==3)
		{
			c-=10;
			d-=10;
			if(c==0&&d==150)
				flag2=4;
		}
		else if(flag2==4)
		{
			c+=10;
			d-=10;
			if(c==150&&d==0)
				flag2=1;
		}
	}
}