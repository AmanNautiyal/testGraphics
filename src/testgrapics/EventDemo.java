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
public class EventDemo 
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public EventDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  EventDemo dem= new EventDemo();
  dem.showEventDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame();
  controlPanel= new Panel();
  headerLabel= new Label();
  statusLabel= new Label();
  mainFrame.setSize(1000,1000);
  mainFrame.setTitle("JAVA EVENT HANDLING EXAMPLE");
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.addWindowListener(new WindowAdapter()
  {
   @Override
   public void windowClosing(WindowEvent e)
   {
     System.exit(0);  
   }
  });
  controlPanel.setLayout(new FlowLayout());
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  headerLabel.setText("Click a button");
  statusLabel.setSize(350,100);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showEventDemo()
 {
  Button ok= new Button("OK");
  Button sub= new Button("SUBMIT");
  Button cnl= new Button("CANCEL");
  ok.setActionCommand("OK");
  sub.setActionCommand("SUBMIT");
  cnl.setActionCommand("CANCEL");
  ok.addActionListener(new ButtonActionListener());
  sub.addActionListener(new ButtonActionListener());
  cnl.addActionListener(new ButtonActionListener());
  controlPanel.add(ok);
  controlPanel.add(sub);
  controlPanel.add(cnl);
  mainFrame.setVisible(true);
 }
 private class ButtonActionListener implements ActionListener
 {
  @Override
  public void actionPerformed(ActionEvent e)
  {
   if(e.getActionCommand().equals("OK"))
     statusLabel.setText("OK Button Clicked");
   else if(e.getActionCommand().equals("SUBMIT"))
     statusLabel.setText("SUBMIT Button Clicked");
   if(e.getActionCommand().equals("CANCEL"))
     statusLabel.setText("CANCEL Button Clicked");
   
  }
 }
}
