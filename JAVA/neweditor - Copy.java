import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.io.*;

public class newEditor extends Frame
{
String filename;
TextArea tx;
Clipboard clip = getToolkit().getSystemClipboard();

newEditor()
{
setLayout(new GridLayout(1,1));
tx = new TextArea();
add(tx);

MenuBar mb = new MenuBar();
setMenuBar(mb);

Menu E = new Menu("Edit");
mb.add(E);

MenuItem cut = new MenuItem("Cut");
MenuItem copy = new MenuItem("Copy");
MenuItem paste = new MenuItem("Paste");
MenuItem end = new MenuItem("Exit");

cut.addActionListener(new Cut());
E.add(cut);
copy.addActionListener(new Copy());
E.add(copy);
paste.addActionListener(new Paste());
E.add(paste);
end.addActionListener(new end());
E.add(end);

mylistener mylist = new mylistener();
addWindowListener(mylist);
}

class mylistener extends WindowAdapter
{
public void windowClosing (WindowEvent e)
{
System.exit(0);
}
}

class end implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
System.exit(0);
}
}

class Cut implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
String sel = tx.getSelectedText();
StringSelection ss = new StringSelection(sel);
clip.setContents(ss,ss);
tx.replaceRange(" ",tx.getSelectionStart(),tx.getSelectionEnd());
}
}

class Copy implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
String sel = tx.getSelectedText();
StringSelection clipString = new StringSelection(sel);
clip.setContents(clipString,clipString);
}
}

class Paste implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
Transferable cliptran = clip.getContents(newEditor.this);
try
{
String sel = (String) cliptran.getTransferData(DataFlavor.stringFlavor);
tx.replaceRange(sel,tx.getSelectionStart(),tx.getSelectionEnd());
}
catch(Exception exc)
{
System.out.println("not string flavour");
}
}
}

public static void main(String args[])
{
Frame f = new newEditor();
f.setSize(700,700);
f.setVisible(true);
f.show();
}
}
