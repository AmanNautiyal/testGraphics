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
public class CheckboxGroupDemo 
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public CheckboxGroupDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  CheckboxGroupDemo dem=new CheckboxGroupDemo();
  dem.showCheckboxGroupDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("Java Checkboxgroup demo");
  controlPanel=new Panel();
  headerLabel= new Label();
  statusLabel= new Label();
  mainFrame.setSize(600,600);
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.addWindowListener(new WindowAdapter()
  {
   @Override
   public void windowClosing(WindowEvent e)
   {
       System.exit(0);
   }
  });
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  headerLabel.setText("Java Checkboxgroup demo");
  controlPanel.setLayout(new FlowLayout());
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
  mainFrame.setVisible(true);
 }
 private void showCheckboxGroupDemo()
 {
  CheckboxGroup chosen=new CheckboxGroup();
  Checkbox vasu=new Checkbox("Vasu",chosen,false);
  Checkbox mini=new Checkbox("Mini",chosen,true);
  vasu.addItemListener(new ImplItemListener(1));
  mini.addItemListener(new ImplItemListener(2));
  controlPanel.add(vasu);
  controlPanel.add(mini);
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
           statusLabel.setText("Vasu "+(e.getStateChange()==1?"chosen":"unchosen"));break;
          case 2:
           statusLabel.setText("Mini "+(e.getStateChange()==1?"chosen":"unchosen"));break;
      }
     }
 }
             
}
