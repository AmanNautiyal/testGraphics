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
public class ComponentEventDemo
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public ComponentEventDemo()
 {
  prepareGUI();
 }
 public static void main(String args[]) 
 {
  ComponentEventDemo dem= new ComponentEventDemo();
  dem.showComponentEventDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA COMPONENT EVENT DEMO");
  controlPanel= new Panel();
  headerLabel= new Label();
  statusLabel= new Label();
  mainFrame.setSize(1000,1000);
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
  headerLabel.setText("Component is below:");
  statusLabel.setSize(350,100);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
  mainFrame.setVisible(true);
 }
 private void showComponentEventDemo()
 {
  ScrollPane pane= new ScrollPane();
  pane.setBackground(Color.YELLOW);
  Label lb= new Label("Welcome");
  lb.setAlignment(Label.CENTER);
  pane.add(lb);
  pane.addComponentListener(new CustomComponentListener());
  controlPanel.add(pane);
  mainFrame.setVisible(true);
 }
 private class CustomComponentListener implements ComponentListener
 {
     @Override
     public void componentHidden(ComponentEvent e)
     {
         statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+" hidden");
     }
     @Override
     public void componentShown(ComponentEvent e)
     {
       statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+" shown");  
     }
     @Override
     public void componentMoved(ComponentEvent e)
     {
         statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+" moved");
     }
     @Override
     public void componentResized(ComponentEvent e)
     {
        statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+" resized"); 
     }
 }        
}
