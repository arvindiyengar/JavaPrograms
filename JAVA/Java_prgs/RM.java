
/*Implementation Of RM-Scheduling Algorithm*/


import java.io.*;

class RM 
{
	public static void main(String[] arg) throws IOException
	{
		int[] p,e,L;
		int[][] c;
		int cnt,i,j,k,tmp,n,sum,time;
		boolean[] rmOk;

		DataInputStream in = new DataInputStream(System.in);

		/*Read Number of Tasks*/

		System.out.print("Enter No. of Tasks: ");
		n = Integer.parseInt(in.readLine());


/*
		Sample Data...
		int[] e = {0,20,30,80,100};
		int[] p = {0,100,150,210,400};
*/
	

		/*Read Execution Times and Periods*/
 
		e = new int[n+1];
		p = new int[n+1];
		for(i=1;i<=n;i++)
		{
			System.out.print("Enter Execution Time E-"+i+": ");
			e[i] = Integer.parseInt(in.readLine());
		
			System.out.print("Enter Period P-"+i+": ");
			p[i] = Integer.parseInt(in.readLine());
		}


		/*Calculation of Compute Time */


		System.out.println("\nTaskNo\tExe.Time(e)\tPeriod");
		for(i=1;i<=n;i++)
			System.out.println(i+"\t"+e[i]+"\t\t"+p[i]);
	
		c = new int[n+1][20];
		L = new int[n+1];

		System.out.println("\nL-Values: ");
		for(i = 1;i<=n;i++)
		{			
			cnt=0;
			System.out.print("Task-"+i+": ");
			for(j=1;j<=i;j++)
			{
				L[j] = (int)(p[i]/p[j]);
				System.out.print(L[j]+",");
			}
			System.out.println();
		
			for(k=1;k<=i;k++)
			{
				for(j=1;j<=i;j++)
				{
					tmp = L[k]*p[j];
					if(tmp<=p[i] && hasNo(c[i],tmp)==false)
					{
						c[i][cnt] = tmp;
						cnt++;
					}
				}
			}
		}
		
		System.out.println("\nThe ComputeTime: \n");
		for(i=1;i<=n;i++)
		{
			System.out.print("Task-"+i+": ");
			for(j=0;j<c[i].length;j++)
			{
				if(c[i][j]!=0)	
					System.out.print(c[i][j]+", ");
			}
			System.out.println();
		}


		/* Determining RM-Scheduling Conditions */

		rmOk = new boolean[n+1];

		System.out.println("\nRM-Scheduling Conditions...");
		for(i=1;i<=n;i++)
		{
			System.out.print("\n\nTask-"+i+": ");
			rmOk[i] = false;
			for(j=0;j<c[i].length;j++)
			{
				if(c[i][j]!=0)	
				{
					System.out.print(" \nFor "+c[i][j]+": ");
					sum = 0;
					time = c[i][j];
					for(k=1;k<=i;k++)
					{
						sum = sum + ( (int)Math.ceil((double)time/p[k])*e[k]);
					}
					System.out.print(sum+" <= "+time);
					if(sum<=time)
						rmOk[i] = true;
				}
			}
		}

		System.out.println("\n\n***************************************");
		System.out.println("Final Conclusion: ");
		System.out.println("***************************************");
		for(i=1;i<=n;i++)
		{
			if(rmOk[i])
				System.out.println("Task-"+i+" Can Be RM-Scheduled...");
			else
				System.out.println("Task-"+i+" Can Not Be RM-Scheduled...");
		}
		System.out.println("***************************************");
				
	}
	
	public static boolean hasNo(int[] a,int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
				return(true);
		}
		return(false);
	}		
}	
		 