import java.io.*;

class Input
{
	public static void main(String[] arg) throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		String s = in.readLine();
		int x = Integer.parseInt(s);
		System.out.println(x);
		
		BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
		String y = In.readLine();
		System.out.println(y);
		
	}
}