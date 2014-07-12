import java.awt.*;
import java.applet.*;
/*
<applet code="StyleText" width=800 height=600>
</applet>
*/
public class StyleText extends Applet implements Runnable
{
	Thread t;
	String s;
	Color maroon;
	int stx=400,y1=300,y2=300,len;
	int x1=400,x2=400;
	boolean test=true;

	public void init()
	{
		maroon =new Color(0x80,50,0);
		Font myFont = new Font("TimesRoman", Font.BOLD, 18);
		setForeground(Color.white);
		setBackground(maroon);
		setFont(myFont);
	}
	public void paint(Graphics g)
	{

		for(int i=0;i<len;i=i+2)
		{
			if(i<len/2)
				g.drawString(""+s.charAt(i),x1+20*i,y1);
			else
				g.drawString(""+s.charAt(i),x2+20*i,y1);		
		}
		for(int i=1;i<len;i=i+2)
		{
			if(i<len/2)
				g.drawString(""+s.charAt(i),x1+20*i,y2);
			else
				g.drawString(""+s.charAt(i),x2+20*i,y2);	
		}


/*		for(int i=0;i<len;i=i+2)
			g.drawString(""+s.charAt(i),x1+20*i,y1);		
		for(int i=1;i<len;i=i+2)
			g.drawString(""+s.charAt(i),x2+20*i,y2);
*/

/*		for(int i=0;i<len;i=i+2)
			g.drawString(""+s.charAt(i),stx+20*i,y1);		
		for(int i=1;i<len;i=i+2)
			g.drawString(""+s.charAt(i),stx+20*i,y2);
*/
	}
	public void stop()
	{
		test=false;
	}
	public void start()
	{
		s = "WELDONE SEENU";
		len = s.length();
		System.out.println(len);
		t=new Thread(this);	
		t.start();
	}
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{}
		while(test)			
		{
			try
			{
				repaint();
				Thread.sleep(200);
				y1 = y1-5;
				y2 = y2+5;
				x1 = x1-5;
				x2 = x2+5;
				if(y1==0)
				{
					y1 = y2 = 300;		
					x1 = x2 = 400;
				}
			}
			catch(Exception e)		
			{}
		}
	}
}