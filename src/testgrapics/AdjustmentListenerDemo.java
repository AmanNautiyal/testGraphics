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
public class AdjustmentListenerDemo
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 public AdjustmentListenerDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  AdjustmentListenerDemo dem= new AdjustmentListenerDemo();
  dem.showAdjustmentListenerDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame();
  headerLabel= new Label();
  statusLabel= new Label();
  controlPanel= new Panel();
  mainFrame.setTitle("JAVA ADJUSTMENT LISTENER DEMO");
  mainFrame.setSize(400,400);
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.addWindowListener(new WindowAdapter()
  {
   @Override
   public void windowClosing(WindowEvent e)
   {
     System.exit(0);
   }
  });
  headerLabel.setText("Adjust:");
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(350,100);
  controlPanel.setLayout(new FlowLayout());
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showAdjustmentListenerDemo()
 {
  ScrollPane sc= new ScrollPane();
  sc.setBackground(Color.yellow);
  sc.getHAdjustable().addAdjustmentListener(new CustomAdjustmentListener());
  Label abc= new Label();
  abc.setText("Aman");
  abc.setAlignment(Label.CENTER);
  sc.add(abc);
  controlPanel.add(sc);
  mainFrame.setVisible(true);
 }
 private class CustomAdjustmentListener implements AdjustmentListener
 {
     @Override
     public void adjustmentValueChanged(AdjustmentEvent e)
     {
        statusLabel.setText("Adjustment Value: "+e.getValue()); 
     }
 }
}
