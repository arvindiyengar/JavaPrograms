import java.awt.*;
import java.awt.event.*;
import java.applet.*;

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
		Object src = ae.getSource();
		if(src == exit)
		{
			System.exit(1);
		}
		else if(src == copy)
		{
			cpText = ta.getSelectedText();
		}
		else if(src == paste)
		{
			ta.insertText(cpText,ta.getSelectionStart());
//			ta.insert(cpText,ta.getCaretPosition());
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
			ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
		}
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

public class TextEdit 
{
	public static void main(String[] arg)
	{
		new NotePad();
	}
}