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
public class MouseListenerDemo
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 public MouseListenerDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  MouseListenerDemo dem =new MouseListenerDemo();
  dem.showMouseListenerDemo();
 }
 private void prepareGUI()
 {
     mainFrame= new Frame();
     headerLabel= new Label();
     statusLabel= new Label();
     controlPanel= new Panel();
     mainFrame.setTitle("JAVA MOUSE LISTENER DEMO");
     mainFrame.setSize(1000,1000);
     mainFrame.setLayout(new GridLayout(3,1));
     headerLabel.setAlignment(Label.CENTER);
     statusLabel.setAlignment(Label.CENTER);
     headerLabel.setText("Click Here");
     statusLabel.setSize(350,100);
     mainFrame.addWindowListener(new WindowAdapter()
     {
      @Override
      public void windowClosing(WindowEvent e)
      {
          System.exit(0);
      }    
     });
     controlPanel.setLayout(new FlowLayout());
     mainFrame.add(headerLabel);
     mainFrame.add(controlPanel);
     mainFrame.add(statusLabel);
 }
 private void showMouseListenerDemo()
 {
   Panel mn=new Panel();
   mn.setBackground(Color.YELLOW);
   mn.setLayout(new FlowLayout());
   mn.addMouseListener(new CustomMouseListener());
   Label in =new Label();
   in.setAlignment(Label.CENTER);
   in.addMouseListener(new CustomMouseListener());
   mn.add(in);
   controlPanel.add(mn);
   mainFrame.setVisible(true);
 }
 private class CustomMouseListener implements MouseListener
 {

        @Override
        public void mouseClicked(MouseEvent e)
        {
          statusLabel.setText("Mouse clicked at "+e.getX()+" & "+e.getY());
        }

        @Override
        public void mousePressed(MouseEvent e)
        {
        statusLabel.setText("Mouse Pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) 
        {
        statusLabel.setText("Mouse Released");
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
        statusLabel.setText("Mouse Entered");
        }

        @Override
        public void mouseExited(MouseEvent e) 
        {
        statusLabel.setText("Mouse Exited");
        }
     
 }
}
