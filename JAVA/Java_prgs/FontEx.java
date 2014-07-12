import java.awt.*;
import java.applet.*;
import java.io.*;

/*
<applet code="FontEx" width=300 height=300>
</applet>
*/

public class FontEx extends Applet 
{
	String fonts[];
	public void start()
	{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fonts = ge.getAvailableFontFamilyNames();
		for(int i=0;i<fonts.length;i++)
			System.out.println(fonts[i]);
	}
}
