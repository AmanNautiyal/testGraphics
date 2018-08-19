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
public class CanvasDemo 
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public CanvasDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  CanvasDemo dem=new CanvasDemo();
  dem.showCanvasDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA CANVAS DEMO");
  controlPanel= new Panel();
  headerLabel= new Label();
  statusLabel= new Label();
  mainFrame.setSize(600,600);
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
       System.exit(0);
   }    
  });
  statusLabel.setSize(350,100);
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  controlPanel.setLayout(new FlowLayout());
  headerLabel.setText("The graphics appear here");
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showCanvasDemo()
 {
  controlPanel.add(new MyCanvas());
  mainFrame.setVisible(true);
 }
 class MyCanvas extends Canvas
 {
  public MyCanvas()
  {
   setBackground(Color.yellow);
   setSize(400,300);
  }
  @Override
  public void paint(Graphics g)
  {
   Graphics2D g2;
   g2=(Graphics2D) g;
g2.setColor(Color.red);
   g2.drawString("Aman",100, 100);
  }
 }
}
