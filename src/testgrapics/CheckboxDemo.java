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
public class CheckboxDemo 
{
 private Frame mainFrame;
 private Panel controlPanel;
 private Label headerLabel;
 private Label statusLabel;
 public CheckboxDemo()
 {
  prepareGUI();   
 }
 public static void main(String args[])
 {
  CheckboxDemo dem= new CheckboxDemo();
  dem.showCheckboxDemo();
 }
 private void prepareGUI()
 {
  mainFrame=new Frame();
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.setSize(600,600);
  mainFrame.addWindowListener(new WindowAdapter()
  {
    @Override
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);  
    }
  });
  headerLabel=new Label();
  statusLabel= new Label();
  controlPanel= new Panel();
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(300,300);
  controlPanel.setLayout(new FlowLayout());
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
  mainFrame.setVisible(true);
 }
 private void showCheckboxDemo()
 {
  headerLabel.setText("Checkbox Demo");
  Checkbox aman=new Checkbox("Aman");
  Checkbox aditi=new Checkbox("Aditi");
  Checkbox goldy=new Checkbox("Goldy");
  Checkbox mona=new Checkbox("Mona");
  aman.addItemListener(new ImplItemListener(1));
  aditi.addItemListener(new ImplItemListener(2));
  goldy.addItemListener(new ImplItemListener(3));
  mona.addItemListener(new ImplItemListener(4));
  controlPanel.add(aman);
  controlPanel.add(aditi);
  controlPanel.add(goldy);
  controlPanel.add(mona);
  mainFrame.setVisible(true);
 }
 private class ImplItemListener implements ItemListener
{
    int x;
    public ImplItemListener(int i)
    {
     x=i;
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
     switch(x)
     {
         case 1:
          statusLabel.setText("Aman "+(e.getStateChange()==1?"checked":"unchecked"));break;
         case 2:
          statusLabel.setText("Aditi "+(e.getStateChange()==1?"checked":"unchecked"));break;
         case 3:
          statusLabel.setText("Goldy "+(e.getStateChange()==1?"checked":"unchecked"));break;
         case 4:
          statusLabel.setText("Mona "+(e.getStateChange()==1?"checked":"unchecked"));break;
     }
    }
    
}
}
