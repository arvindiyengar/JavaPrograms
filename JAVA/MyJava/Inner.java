
class S
{
	private int a=100;
	S()
	{
		System.out.println("Object Created With No Argument..");
	}
	S(int x)
	{
		a = x;
		System.out.println("Object Created With "+x);
	}
	void disp()
	{
		System.out.println("Hai:S a="+a);
	}
	class V
	{
		void disp()
		{
			System.out.println("Hai:V a="+a);				
		}	
	}
	static class VV
	{
		void disp()
		{
			System.out.println("Hai:VV Can't access a...");				
		}	
	
	}
}


class Program
{
	public static void main(String[] args)
	{
		S m = new S();
		m.disp();
		//m.VV.disp();					
	}
}
