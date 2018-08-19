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
public class ContainerListenerDemo
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 public ContainerListenerDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  ContainerListenerDemo dem= new ContainerListenerDemo();
  dem.showContainerListenerDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame();
  headerLabel= new Label();
  statusLabel= new Label();
  controlPanel= new Panel();
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.setSize(1000,1000);
  mainFrame.setTitle("JAVA CONTAINER LISTENER DEMO");
  mainFrame.addWindowListener(new WindowAdapter()
  {
   @Override
   public void windowClosing(WindowEvent e)
   {
     System.exit(0);
   }
  });
  controlPanel.setLayout(new FlowLayout());
  headerLabel.setText("Container Listener");
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showContainerListenerDemo()
 {
  ScrollPane panel= new ScrollPane();
  panel.setBackground(Color.YELLOW);
  panel.addContainerListener(new CustomContainerListener());
  Label lb =new Label();
  lb.setAlignment(Label.CENTER);
  lb.setText("Sample Text");
  panel.add(lb);
  controlPanel.add(panel);
  
  mainFrame.setVisible(true);
 }
 private class CustomContainerListener implements ContainerListener
 {

        @Override
        public void componentAdded(ContainerEvent e) {
          statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+" added");
        }

        @Override
        public void componentRemoved(ContainerEvent e) {
           statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+" removed");
        }
 
 }
}
