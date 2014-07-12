import java.io.*;
import java.util.*;

class TimeLine
{
	int tno,itr;
	double from,to;
	
	TimeLine()
	{
		from=to=tno=itr=0;	
	}
	
	TimeLine(double from, double to, int tno, int itr)
	{
		this.from = from;
		this.to = to;
		this.tno = tno;
		this.itr = itr;
	}
	void show()
	{
		System.out.println("\t"+from+"\t"+to+"\t"+tno+"-"+itr);
	}
	double getFrom()
	{
		return(from);
	}
}

class ScheduleRM
{
	TimeLine[] time = new TimeLine[100];
	int tc=0;
	double Max = 30;

	double[]  free;
	int m;

	public void doSchedule() throws IOException
	{
		free = new double[100];
		free[0] = 0;
		free[1] = Max;
		m=2;
		
		int itr,tn;
		double p,i,e;
		int a,b,c;	
		double tmp;
		int n = 3;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nWelcome To RM-Scheduling Tasks...");
		System.out.println("\nThe Maximum Time Assigned: "+Max+" TimeUnits");	

		System.out.print("\n\nEnter No. Of Tasks: ");
		n = Integer.parseInt(in.readLine());

		double[] pt = new double[100];

		double[] P = new double[n];
		double[] E = new double[n];
		double[] I = new double[n];

/*		double[] P = {2,6,10};
		double[] E = {0.5,2.0,1.75};
		double[] I = {0,1,3};
*/		
		
		for(a=0;a<n;a++)
		{
			c = a+1;

			System.out.println("\nFor Task-"+c+":");
			System.out.println("--------------------------");
			System.out.print("Enter Period P"+c+":");
			P[a] = Double.parseDouble(in.readLine());

			System.out.print("Enter Execution Time E"+c+":");
			E[a] = Double.parseDouble(in.readLine());

			System.out.print("Enter Phasing Time I"+c+":");
			I[a] = Double.parseDouble(in.readLine());
		}

		/*Finding Priority and Arranging Tasks As Per Periority*/

		for(a=0;a<n;a++)
		{
			for(b=a+1;b<n;b++)
			{
				if(P[b]<P[a])
				{
					tmp = E[a];	E[a] = E[b];	E[b] = tmp;
					tmp = P[a];	P[a] = P[b];	P[b] = tmp;
					tmp = I[a];	I[a] = I[b];	I[b] = tmp;
				}
			}
		}
					
		System.out.println("\n\nTask List As Per Priority");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\tTask\tPeriod(P)\tExe.Time(E)\tPhasingTime(I)");
		System.out.println("-----------------------------------------------------------------");
		for(a=0;a<n;a++)
		{
			c = a+1;
			System.out.println("\t"+c+"\t"+P[a]+"\t\t"+E[a]+"\t\t"+I[a]);
		}
		System.out.println("-----------------------------------------------------------------");

		for(a=0;a<n;a++)
		{
			tn = a+1;

			i = I[a];
			e = E[a];
			p = P[a];
		
			pt = generatePT(i,p);

	/*		System.out.println();
			for(b=0;b<pt.length && pt[b]>=0;b++)
				System.out.print("\t"+pt[b]);
			System.out.println();
	*/

			for(b=0;b<pt.length && pt[b]>=0;b++)
			{
				i = pt[b];
				itr = b+1;
				scheduleTask(tn,itr,i,e);

	/*			System.out.println("\nFree Intervals...");
			for(c=0;c<m;c++)
				System.out.print(free[c]+"\t");
	*/
			}
		}
		

		System.out.println("\nRM-Schdule: (Max Time: " +Max+") - TASK WISE");
		System.out.println("------------------------------------------------------");
		System.out.println("\tFrom\tTo\tTask-Iteration");	
		System.out.println("------------------------------------------------------");

		for(b=0;b<tc;b++)
			time[b].show();

		time = sort(time,tc);		

		System.out.println("\nRM-Schdule: (Max Time: " +Max+") - TIME WISE");
		System.out.println("------------------------------------------------------");
		System.out.println("\tFrom\tTo\tTask-Iteration");	
		System.out.println("------------------------------------------------------");

		for(b=0;b<tc;b++)
			time[b].show();
	}	

	TimeLine[] sort(TimeLine[] ti,int tc)
	{
		int a,b;
		TimeLine tmp;
		for(a=0;a<tc;a++)
		{
			for(b=a+1;b<tc;b++)
			{
				if(ti[b].from<ti[a].from)
				{
					tmp = ti[a];
					ti[a] = ti[b];
					ti[b] = tmp;
				}
			}
		}
		return(ti);
	}
		
	void scheduleTask(int tn, int itr, double i, double e)
	{
		int k;
		int ix,iy;
		double x,y,avail,s;
		
		for(k=0;k<m;k+=2)
		{
			ix = k;
			iy = k+1;
	
			x = free[ix];
			y = free[iy];

			if(x!=y)
			{
				if(i<y)
				{
					if(i<x)
						i=x;

					avail = y-x;
					if(avail>=e)
					{
						time[tc] = new TimeLine(i,i+e,tn,itr);
						tc++;
						insert(i,i+e,ix,iy);
						return;
					}
					else
					{
						time[tc] = new TimeLine(i,y,tn,itr);
						tc++;
						insert(i,y,ix,iy);
						s = y-i;
						e = e-s;
						scheduleTask(tn,itr,i,e);
						return;
					}
				}
			}
		}
	}

	double[] generatePT(double i,double p)
	{
		double[] t = new double[100];
		int cnt=0;
		double tmp;
	
		while(true)
		{
			tmp = i + (p*cnt);
			if(tmp>=Max)
				break;
			t[cnt] = tmp;
			cnt++;
		}

		Arrays.fill(t,cnt,t.length,-1);

		return(t);		
	}
	void insert(double i, double j, int ix, int iy)
	{
		int a,b,c;
	
		for(b=m-1;b>=ix;b--)
		{
			free[b+2] = free[b];
		}
		
		free[ix+1] = i;
		free[ix+2] = j;

		m = m+2;
	} 		 

}

class RMS
{
	public static void main(String[] arg) throws IOException
	{
		ScheduleRM rms = new ScheduleRM();
		rms.doSchedule();
	}
}