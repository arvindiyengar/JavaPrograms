import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
import java.util.*;
import java.awt.datatransfer.*;//Clipboard;



class TextWriter {

	public static void writeToClipboard(String writeMe) {
		Clipboard systemClipboard =	Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable transferableText =	new StringSelection(writeMe);
		systemClipboard.setContents(transferableText,null);
	}
	
	public static String getClipboard() {
		
		Clipboard systemClipboard =	Toolkit.getDefaultToolkit().getSystemClipboard();
    		Transferable clipboardContents = systemClipboard.getContents(null);
		if (clipboardContents == null) {
			return ("Clipboard is empty!!!");
		} else
			try {
					if (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
									String returnText =	(String) clipboardContents.getTransferData(DataFlavor.stringFlavor);
					return returnText;
				}
			} catch (UnsupportedFlavorException ufe) {
				ufe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		return null;
	}

}
	

class NotePad extends Frame implements ActionListener
{
	MenuBar mb;
	Menu file,edit;
	MenuItem ne,save,open,exit;
	MenuItem copy,cut,paste,find,replace;
	TextArea ta;	
	String cpText="";

	NotePad()
	{
		mb = new MenuBar();
		setMenuBar(mb);

		file = new Menu("File");
		edit = new Menu("Edit");

		ne = new MenuItem("New");
		save = new MenuItem("Save");
		open = new MenuItem("Open");
		exit = new MenuItem("Exit");

		cut = new MenuItem("Cut");
		copy = new MenuItem("Copy");
		paste = new MenuItem("Paste");
		find = new MenuItem("Find");
		replace = new MenuItem("Replace");

		file.add(ne);
		file.add(open);
		file.add(save);
		file.add(exit);

		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(find);
		edit.add(replace);

		mb.add(file);
		mb.add(edit);
	
		ne.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		find.addActionListener(this);
		replace.addActionListener(this);	

		ta = new TextArea(10,100);
		add(ta);

		addWindowListener(new MyWinAda(this));
		setSize(300,300);
		setVisible(true);		
	}

	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
		Object src = ae.getSource();
		if(src == exit)
		{
			System.exit(1);
		}
		else if(src == copy)
		{
			cpText = ta.getSelectedText();
			TextWriter.writeToClipboard(cpText);
		}
		else if(src == paste)
		{  
			String s = ta.getText();
			int t = ta.getSelectionStart();
			cpText = TextWriter.getClipboard();
			String st =  s.substring(0,t) + cpText + s.substring(t,s.length());
		//	System.out.println(""+ta.getSelectionStart()+"\t"+ta.getCaretPosition());
			ta.setText(st);
		}
		else if(src == replace)
		{
			System.out.println("\n"+ta.getSelectionStart());
			System.out.println(ta.getSelectionEnd());
			System.out.println(ta.getCaretPosition());
			System.out.println(ta.getRows());
			System.out.println(ta.getColumns());

		}
		else if(src == cut)
		{
			cpText = ta.getSelectedText();
			TextWriter.writeToClipboard(cpText);

			String tt = ta.getText();
			byte[] b = tt.getBytes();
			int st,end,cc;
			st = ta.getSelectionStart();
			end = ta.getSelectionEnd();
			cc = new String(Arrays.copyOfRange(b,0,st)).length();
		//	System.out.println("+"+new String(b)+"+");
		//	System.out.println("*"+b.length+"*"+new String(Arrays.copyOfRange(b,0,st))+"*"+new String(Arrays.copyOfRange(b,end,b.length))+"*\n\n");
			cpText = new String(Arrays.copyOfRange(b,0,st))+new String(Arrays.copyOfRange(b,end,b.length));
		//	System.out.println(ta.getSelectionStart()+ "<==>"+ta.getSelectionEnd());
		//	System.out.println(ta.getSelectionStart()+ "<==>"+ta.getCaretPosition());
			ta.setText(cpText);
			ta.setCaretPosition(cc);
	
		//	ta.replaceRange("",st,end);
		}
		else if(src == save)
		{
			FileDialog fd = new FileDialog(new Frame(),"Save", FileDialog.SAVE);
			fd.setVisible(true);
			System.out.println(""+fd.getDirectory()+""+fd.getFile());
			String fName = ""+fd.getDirectory()+""+fd.getFile();
			File f = new File(fName);
			FileOutputStream fout = new FileOutputStream(f,true);
			String s = ta.getText();
			byte[] b = new byte[s.length()];
			b = s.getBytes();
			fout.write(b);
			fout.close();
		}
		else if(src == open)
		{
			FileDialog fd = new FileDialog(new Frame(),"Open", FileDialog.LOAD);
			fd.setVisible(true);

			System.out.println(""+fd.getDirectory()+""+fd.getFile());
			String fName = ""+fd.getDirectory()+""+fd.getFile();

			File f = new File(fName);
			FileInputStream fin = new FileInputStream(f);
			int size = fin.available();
	    		byte[] b1 = new byte[size];
			System.out.println("\nSize of File: "+size);
			fin.read(b1,0,size);
			ta.setText(new String(b1,0,b1.length));
			//System.out.println(new String(b1,0,b1.length));
			fin.close();
		}
		else if(src==ne)
		{
			ta.setText("");
		}
		else if(src == find)
		{
			System.out.println();
			String s = ta.getText();
			int t = ta.getSelectionStart();
			//System.out.println("\t["+s.substring(0,t)+"] AND [" + s.substring(t+1,s.length()) + "]"); 
			String st =  s.substring(0,t) + "SUCCESS" + s.substring(t,s.length());
			System.out.println(st);
			System.out.println();
			 
		}
	}
	catch(Exception e)
	{}
	}
}

class MyWinAda extends WindowAdapter
{
	NotePad txt;
	MyWinAda(NotePad t)
	{
		txt = t;
	}
	public void windowClosing(WindowEvent we)
	{
		txt.setVisible(false);
		System.exit(1);
	}
}

public class MyTextEdit 
{
	static  
	{
		new NotePad();
		MyTextEdit e = new MyTextEdit();
		e.show();
	}
	public static void main(String[] a)
	{
		System.out.println("End...");
	}
	void show()
	{
		System.out.println("Hi.. ");
	}
}