import java.io.*;
class InputDIS
{
	static void input() throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		String s,a;

		System.out.println("\nLine Input: ");
		s = in.readLine();
		a = s.toString();

		System.out.println("\nInteger Input: ");
		s = in.readLine();
		int b = Integer.parseInt(s);

		System.out.println("\nFloat Input: ");
		s = in.readLine();
		float c = Float.parseFloat(s);

		System.out.println("\nDouble Input: ");
		s = in.readLine();
		double d = Double.parseDouble(s);

		System.out.println("\nBoolean Input: ");
		s = in.readLine();
		boolean e = Boolean.valueOf(s).booleanValue();


		System.out.println("\nString: "+a);			
		System.out.println("\nInteger: "+b);			
		System.out.println("\nFloat: "+c);			
		System.out.println("\nDouble: "+d);			
		System.out.println("\nBoolean: "+e);			

	}
	public static void main(String[] arg) throws IOException
	{
		/*Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		System.out.println(line);*/

		/*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));*/
		
		input();
	}
}