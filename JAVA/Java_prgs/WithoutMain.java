
class Summa
{
	static
	{
		System.out.println("\nSuccess...");
	}
}
class WithoutMain
{
	static
	{
		System.out.println("\nWithout Main Method Success...");
		System.out.println("\nThis is Possible by STATIC BLOCK...");
		System.out.println("And Calling Static Methods println and exit(0)...");
		System.exit(0);
	}
	public static void main(String[] a)
	{
		Summa x;
	}
}