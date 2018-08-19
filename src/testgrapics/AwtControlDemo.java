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
public class AwtControlDemo 
{
 private Frame mainFrame; 
 private Label headerLabel,statusLabel;
 private Panel controlPanel;
 public AwtControlDemo()
 {
     prepareGUI();
 }
 public static void main(String args[])
 {
   AwtControlDemo awtControlDemo= new AwtControlDemo();
   awtControlDemo.showLabelDemo();
 }
 private void prepareGUI()
 {
   mainFrame= new Frame("Java Awt example");
   mainFrame.setSize(700, 700);
   mainFrame.setLayout(new GridLayout(5,3));
  mainFrame.addWindowListener(new WindowAdapter()
  {
      @Override
   public void windowClosing(WindowEvent e)
   {
       System.exit(0);
   }
  });
  headerLabel=new Label();
  statusLabel=new Label();
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(350,100);
  controlPanel=new Panel();
  mainFrame.add(headerLabel);
  mainFrame.add(statusLabel);
  mainFrame.add(controlPanel);
  mainFrame.setVisible(true);
  headerLabel.setBackground(Color.BLUE);
  statusLabel.setBackground(Color.GREEN);
  controlPanel.setBackground(Color.RED);
 }
 private void showLabelDemo()
 {
  headerLabel.setText("Control in action:Label");
  Label label=new Label();
  label.setText("Aman Dev Nautiyal");
  label.setAlignment(Label.CENTER);
  label.setBackground(Color.BLACK);
  label.setForeground(Color.YELLOW);
  controlPanel.add(label);
  mainFrame.setVisible(true);
 }
}
