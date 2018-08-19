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
public class ChoiceDemo 
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 public ChoiceDemo()
 {
      prepareGUI();
 }
 public static void main(String args[])
 {
  ChoiceDemo dem= new ChoiceDemo();
  dem.showChoiceDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA CHOICE DEMO");
  headerLabel= new Label();
  statusLabel= new Label();
  controlPanel= new Panel();
  mainFrame. setSize(600,600);
  mainFrame.setLayout(new GridLayout(3,1));
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
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
 private void showChoiceDemo()
 {
  headerLabel.setText("Choose an item");
  Choice items=new Choice();
  items.add("LAN Cable");
  items.add("Switch");
  items.add("Router");
  items.add("NIC Card");
  items.add("Adapter");
  Button submit = new Button("Submit");
  submit.addActionListener(new ActionListener()
  {
   @Override
   public void actionPerformed(ActionEvent e)
   {   
    statusLabel.setText(items.getSelectedItem());
   }
  });
  controlPanel.add(items);
  controlPanel.add(submit);
  mainFrame.setVisible(true);
 }
}
