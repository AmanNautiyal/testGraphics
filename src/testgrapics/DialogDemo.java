/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgrapics;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Aman Nautiyal
 */
public class DialogDemo 
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public DialogDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  DialogDemo dem=new DialogDemo();
  dem.showDialogDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA DIALOG DEMO");
  mainFrame.setSize(1000,1000);
  mainFrame.setLayout(new GridLayout(3,1));
  headerLabel= new Label();
  statusLabel= new Label();
  controlPanel= new Panel();
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  headerLabel.setText("Dialog button");
  statusLabel.setSize(350,100);
  controlPanel.setLayout(new FlowLayout());
  mainFrame.addWindowListener(new WindowAdapter()
  {
      @Override
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
   }  
  });
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showDialogDemo()
 {
  Button showDialog= new Button("DIALOG");
  showDialog.addActionListener(new ActionListener()
  {
   @Override
   public void actionPerformed(ActionEvent e)
   {
    Dialogx name= new Dialogx(mainFrame);
    name.setVisible(true);
   }
  });
  controlPanel.add(showDialog);
  mainFrame.setVisible(true);
 }
 private class Dialogx extends Dialog
 {
  public Dialogx(Frame parent)
  {
   super(parent);
   setBackground(Color.YELLOW);
   setLayout(new BorderLayout());
   Panel one= new Panel();
   one.add(new Button("Close"));
   add("Center",one);
   setSize(200,200);
   addWindowListener(new WindowAdapter()
   {
       @Override
    public void windowClosing(WindowEvent e)
    {
     dispose();
    }
   });
  }
  @Override
  public boolean action(Event e,Object obj)
  {
      if(obj.equals("Close"))
      {
       dispose();
       return true;
      }
      return false;
  }
  @Override
  public void paint(Graphics g)
  {
   g.setColor(Color.RED);
   g.drawString("Aman",20,70);
  }
 }    
}
