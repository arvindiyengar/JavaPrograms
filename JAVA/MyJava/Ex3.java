


class Employee
{
	private String eName;
	private int eNo;
	public void getData() throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		System.out.print("\n\tName: ");
		eName = in.readLine();
		System.out.print("\n\tEmployee Number: ");
		eNo = Integer.parseInt(in.readLine());
	}
	public void display()
	{
		System.out.println("\tName: " + eName);
		System.out.println("\tNo: " + eNo);
	}
}
public interface Resume
{
	void bioDisp();
}
class Teacher extends Employee implements Resume 
{
	private byte yEx;
	private String aSp;
	private int nPub;
	private String[] pDet;
	public void getData() throws IOException
	{
		System.out.println("\nEnter Details for Teaching Faculty: ");
		super.getData();
		DataInputStream in = new DataInputStream(System.in);
		System.out.print("\n\tYears of Experience: ");
		yEx = Byte.parseByte(in.readLine());
		System.out.print("\n\tArea Of Specialization: ");
		aSp = in.readLine();
		System.out.print("\n\tPublication Details: ");
		System.out.print("\n\t\tNo. of Publications: ");
		nPub = Integer.parseInt(in.readLine());
		pDet = new String[nPub];
		for (int i = 0; i < nPub; i++)
		{
			System.out.print("\n\t\t\tPublication-" + (i + 1) + ": ");
			pDet[i] = in.readLine();
		}
	}
	public void display()
	{
		System.out.println("\nDetails Of Teaching Faculty:");
		System.out.println("****************************************************");
		super.display();
		System.out.println("\tYears of Experience: " + yEx);
		System.out.println("\tArea of Specialization: " + aSp);
		System.out.println("\tPublication Details: ");
		for (int i = 0; i < nPub; i++)
			System.out.println("\t\tPublication-" + (i + 1) + ": " + pDet[i]);

	}

}

class NonTeaching extends Employee
{
	public void getData() throws IOException 
	{
		super.getData();
		System.out.println("Hi");
	}

}

class Clerk extends NonTeaching
{
	private String posDet;

	public void getData() throws IOException  
	{
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("\nEnter Details for Clerk: ");
		super.getData();
		System.out.print("\n\tPosition Details: ");
		posDet  = in.readLine();
	}
	public void display()
	{
		System.out.println("\nDetails Of Clerk:");
		System.out.println("****************************************************");
		super.display();
		System.out.println("\tPosition: " + posDet);
	}
}
class Peon extends NonTeaching
{
	private String eType;

	public void getData() throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("\nEnter Details for Peon: ");
		super.getData();
		System.out.print("\n\tPosition Employee Type(Permanant/Temporary: ");
		eType  = in.readLine();
	}
	public void display()
	{
		System.out.println("\nDetails Of Peon:");
		System.out.println("****************************************************");
		super.display();
		System.out.println("\tEmployee Type: " + eType );
	}
}

public class Program
{
	public static void main(String[] args) throws IOException
	{
		Teaching st = new Teaching();
		st.getData();
		st.display();

		System.out.println("\n---------------------------------------\n\n");

		Clerk nt = new Clerk();
		nt.getData();
		nt.display();

		System.out.println("\n---------------------------------------\n\n");

		Peon p = new Peon();
		p.getData();
		p.display();

		System.out.println("\n---------------------------------------\n\n");

	}
}