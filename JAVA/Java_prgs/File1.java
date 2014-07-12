import java.io.*;

class File1
{
	public static void main(String[] arg) throws FileNotFoundException,IOException
	{
		File f = new File("A.txt");
		FileOutputStream fout = new FileOutputStream(f,true);

		DataInputStream dis = new DataInputStream(System.in);

		String s;
		byte[] b;
		while(true)
		{
			s = dis.readLine();
			b = new byte[s.length()];
			b = s.getBytes();
			if(s.equals("bye"))
				break;
			fout.write(b);
		}
		fout.close();

		FileInputStream fin = new FileInputStream(f);
		int size = fin.available();
		b = new byte[size];	
		System.out.println("\nSize of File: "+size);
		fin.read(b,0,size);
		System.out.println(new String(b,0,b.length));
		fin.close();
	}
}