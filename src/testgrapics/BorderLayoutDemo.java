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
public class BorderLayoutDemo 
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public BorderLayoutDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  BorderLayoutDemo dem=new BorderLayoutDemo();
  dem.showBorderLayoutDemo();
 }
 private void prepareGUI()
 {
  mainFrame=new Frame("JAVA BORDER LAYOUT DEMO");
  mainFrame.setSize(1000,1000);
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
       System.exit(0);
   }   
  });
  controlPanel=new Panel();
  controlPanel.setLayout(new FlowLayout());
  headerLabel=new Label();
  statusLabel=new Label();
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(350,100);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showBorderLayoutDemo()
 {
  Panel panel=new Panel();
  panel.setBackground(Color.red);
  panel.setSize(300,300);
  BorderLayout l=new BorderLayout();
  l.setHgap(20);
  l.setVgap(20);
  panel.setLayout(l);
  panel.add(new Button("LINE START"),BorderLayout.LINE_START);
  panel.add(new Button("LINE END"),BorderLayout.LINE_END);
  controlPanel.add(panel);
  mainFrame.setVisible(true);
 }
}
