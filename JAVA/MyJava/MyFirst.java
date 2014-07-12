class Program
{
	public static void main(String[] args)
	{
		float x;
		x = 10.5F;
		double s = '1'+6.0;
		System.out.println("Success..." + s);
		float f = 10.4f + 348222283423988332L;
		System.out.println("Success..." + f);
		{
			float y = 3.4f;
		
		}
		//----------------------------------------------------------------------------------------------------------------
		System.out.println("------------------------>> and >>>-----------------------------");

		byte d;
		d = 10 >> 2;
		System.out.println("+>>"+d);
		d = -10 >> 2;
		System.out.println("->>" + d);
		d = 10 >>> 2;
		System.out.println("+>>>" + d);
		int c = -1 >>> 24; 
		System.out.println("->>>" + c);

		//System.out.println("(-10/4):" + (-10 / 4));
		//----------------------------------------------------------------------------------------------------------------
		System.out.println("------------------------Increment and Decrement-----------------------------");

		/* ++ and -- */
		
		d = 5;
		//c = d++ + ++d;		// 12 - 7
		c = ++d + ++d;		// 13 - 7
		//c = d++ + d++;		// 11 - 7
		//c = --d + d++;		// 8 - 5
		//c = --d + (d++);		// 8 - 5
		System.out.println("c=" + c + "\td=" + d);
		//----------------------------------------------------------------------------------------------------------------
		System.out.println("------------------------&& and ||-----------------------------");

		// && and ||
		

		c = 5;
		if (c == 5 || ++c == 5)
			System.out.println("|| - True");
		else
			System.out.println("|| - False");
		System.out.println("|c| = " + c);

		c = 5;
		if (c == 6 || ++c==6)
			System.out.println("|| - True");
		else
			System.out.println("|| - False");
		System.out.println("|c| = " + c);

		c = 5;
		if (c == 5 && ++c == 5)
			System.out.println("&& - True");
		else
			System.out.println("&& - False");
		System.out.println("&c& = " + c);

		c = 5;
		if (c == 6 && ++c == 6)
			System.out.println("&& - True");
		else
			System.out.println("&& - False");
		System.out.println("&c& = " + c);

		//----------------------------------------------------------------------------------------------------------------
		System.out.println("------------------------& and |-----------------------------");

		c = 5;
		if (c == 5 | ++c == 5)
			System.out.println("| - True");
		else
			System.out.println("|| - False");
		System.out.println("|c = " + c);

		c = 5;
		if (c == 6 | ++c == 6)
			System.out.println("| - True");
		else
			System.out.println("| - False");
		System.out.println("|c = " + c);

		c = 5;
		if (c == 5 & ++c == 5)
			System.out.println("& - True");
		else
			System.out.println("& - False");
		System.out.println("&c = " + c);

		c = 5;
		if (c == 6 & ++c == 6)
			System.out.println("& - True");
		else
			System.out.println("& - False");
		System.out.println("&c = " + c);

		}
}
