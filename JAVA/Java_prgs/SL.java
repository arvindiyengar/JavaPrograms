import javax.swing.*; // windows
   import java.awt.*; // events and stuff
   import java.awt.event.*; // event
   import java.awt.Component.*;
   import javax.swing.JTextPane;

// our class which is a subclass of JFrame and uses actionlistener
    public class SL extends JFrame implements ActionListener
   {
      private static final int WIDTH = 700; // width of the window
      private static final int HEIGHT = 500; // height of the window
   
   //component declarations
      private JPanel graphics; // panel for everything
   
   // the default constructor
       public SL() 
      {
         graphics = new JPanel();// make the full panel
         
         Icon one = new ImageIcon("cards/2c.gif");
         JLabel display = new JLabel(one);
         graphics.add(display);
         display.setLocation(0,0);
      	
         Icon two = new ImageIcon("cards/3c.gif");
         display = new JLabel(two);
         graphics.add(display);
			display.setLocation(0,20);
        
         setContentPane(graphics);// give our window the graphics panel
      }
     
   // program entry point
       public static void main(String args[])
      {
         SL myGUI = new SL(); // make a new GUI class
         myGUI.setBackground(Color.green); // set its background to green
         myGUI.setSize(WIDTH, HEIGHT); // set its window size
         myGUI.setVisible(true); // make it visible
         myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the program when hitting the x
      }
   
   // actionlistner for the buttons
       public void actionPerformed(ActionEvent ev)
      {
      }
   }