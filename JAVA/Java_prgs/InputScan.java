import java.io.*;
import java.util.*;

class InputScan
{
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("\nRead a Line of Text: ");
		System.out.println("Enter Line: ");
		String line = in.nextLine();

		System.out.println("\nRead a Word: ");
		System.out.println("Enter Word: ");
		String word = in.next();

		System.out.println("\nRead an Integer : ");
		System.out.println("Enter Integer: ");
		int i = in.nextInt();

		System.out.println("\nRead an Integer : ");
		System.out.println("Enter Double: ");
		double d = in.nextDouble();

		System.out.println("\nLine: "+line);
		System.out.println("Word: "+word);
		System.out.println("Integer: "+i);
		System.out.println("Double: "+d);
	}
}
		
