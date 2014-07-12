class Employee
{
	private String eName;
	private int eNo;
	public void getData() throws IOException 
	{
		DataInputStream in = new DataInputStream(System.in);
		System.out.print("\n\t\tEnter Name: ");
		eName = in.readLine();
		System.out.print("\n\t\tEnter Number: ");
		eNo = Integer.parseInt(in.readLine());
	}
	public void display()
	{
		System.out.println("Name: " + eName);
		System.out.println("No: " + eNo);
	}
}
public class Program
{
	public static void main(String[] args) throws IOException 
	{
		
		/*
		DataInputStream myin = new DataInputStream(System.in);
		int i=2;
		i = Integer.parseInt(myin.readLine());
		System.out.println(""+i);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i = Integer.parseInt(br.readLine());
		System.out.println("" + i);
		*/
		DataInputStream in = new DataInputStream(System.in);
		
		/*For 1 Employee*/
		Employee e = new Employee();
		e.getData();
		e.display();

		/*Array of Employees*/
		Employee[] ea;
		int n,i;
		System.out.print("\n\nEnter No of Employee: ");
		n = Integer.parseInt(in.readLine());

		ea = new Employee[n];
		
		for (i = 0; i < n; i++)
			ea[i] = new Employee();

		for (i = 0; i < n; i++)
		{
			System.out.println("\nEnter Details For Employee-" + (i + 1) + ":");
			ea[i].getData();
		}

		for (i = 0; i < n; i++)
		{
			System.out.println("\nDetails of Employee-" + (i + 1) + ":");
			ea[i].display();
		}

	}
}
