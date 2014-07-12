import java.awt.*;
import java.applet.*;
import java.io.*;

/*
<applet code="FontEx2" width=300 height=300>
</applet>
*/

public class FontEx2 extends Applet 
{
	public void start()
	{
		Font f = this.getFont();
		System.out.println("Family Name: "+f.getFamily());
		System.out.println("Face Name: "+f.getName());
		System.out.println("Logical Name: "+f.getFontName());

		Font myFont = new Font("Arial",Font.ITALIC,12);
		setFont(myFont);
		System.out.println("Family Name: "+myFont.getFamily());
		System.out.println("Face Name: "+myFont.getName());
		System.out.println("Logical Name: "+myFont.getFontName());
	}
}
