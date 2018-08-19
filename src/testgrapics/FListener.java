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
public class FListener 
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public FListener()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  FListener dem=new FListener();
  dem.showFocusListenerDemo();
 }
 private void prepareGUI()
 {
  mainFrame=new Frame("JAVA FOCUS LISTENER DEMO");
  headerLabel=new Label();
  statusLabel=new Label();
  controlPanel=new Panel();
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
  statusLabel.setSize(350,100);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showFocusListenerDemo()
 {
  Button okbutton=new Button("OK");
  Button canbutton=new Button("CANCEL");
  okbutton.addFocusListener(new CustomFocusListener());
  canbutton.addFocusListener(new CustomFocusListener());
  controlPanel.add(okbutton);
  controlPanel.add(canbutton);
  mainFrame.setVisible(true);
 }
 private class CustomFocusListener implements FocusListener
 {

        @Override
        public void focusGained(FocusEvent e) 
        {
         statusLabel.setText(statusLabel.getText()+"  "+e.getComponent().getClass().getSimpleName()+" gained Focus\n");
        }

        @Override
        public void focusLost(FocusEvent e) {
           statusLabel.setText(statusLabel.getText()+"  "+e.getComponent().getClass().getSimpleName()+" lost Focus\n");
        }
     
 }
}
