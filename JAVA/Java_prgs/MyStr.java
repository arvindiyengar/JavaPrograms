import java.io.*;

class MyStr
{
	public static void main(String[] arg)
	{
		String a = "AMMA";
		String b = "SUMMA";

		System.out.println("\nCommand Line Arguments: ");
		System.out.println("\nNo. of Arguments: "+arg.length);
		for(int i=0;i<arg.length;i++)
			System.out.println(arg[i]);

		System.out.println("\nLength of String a: "+a.length());
		System.out.println("\nLength of String b: "+b.length());

		String[] A = new String[5];
		A[0] = "FIRST";
		System.out.println("\nLength of String Arry A: "+A.length);

		int [] iA = {3,4,5,6};
		System.out.println("\nLength of Integer Array: "+iA.length);
		
		String[] B = {"First","Second","Third"};
		System.out.println("\n Array B Strings: ");
		
/*		for(String i:B)
			System.out.println(i);*/

		for(byte i=0;i<B.length;i++)
			System.out.println(B[i]);

		/*Reverse*/
		String c="";
		for(int i=b.length()-1;i>=0;i--)
			c = c+b.charAt(i);
		System.out.println("\nReverse of b: "+c);

		System.out.println("\nComparison: ");
		System.out.println(B[0].compareTo(B[1]));
		System.out.println(B[1].compareTo(B[0]));
		System.out.println(B[0].compareTo(B[0]));	
	}
}