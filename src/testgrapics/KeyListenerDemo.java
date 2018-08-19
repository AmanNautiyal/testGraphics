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
public class KeyListenerDemo
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 public KeyListenerDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  KeyListenerDemo dem= new KeyListenerDemo();
  dem.showKeyListenerDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame();
  headerLabel= new Label();
  statusLabel= new Label();
  controlPanel= new Panel();
  mainFrame.setTitle("JAVA KEY LISTENER DEMO");
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
  headerLabel.setText("Type something:");
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(350,100);
  statusLabel.setAlignment(Label.CENTER);
  controlPanel.setLayout(new FlowLayout());
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showKeyListenerDemo()
 {
   TextField txt= new TextField(10);  
   txt.addKeyListener(new CustomKeyListener());
   Button ok = new Button("OK");
   ok.addActionListener(new ActionListener()
   {
    @Override
    public void actionPerformed(ActionEvent e)
    {
     statusLabel.setText("TEXT SUBMITTED: "+txt.getText());
    }
   } );     
  controlPanel.add(txt);
  controlPanel.add(ok);
  mainFrame.setVisible(true);
 }
 private class CustomKeyListener implements KeyListener
 {
     @Override
    public void keyReleased(KeyEvent e)
    {
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
     TextField xyz=(TextField)e.getSource();
     if(e.getKeyCode()==KeyEvent.VK_ENTER)
        statusLabel.setText("ENTERED TEXT: "+xyz.getText());
    }
    @Override
    public void keyTyped(KeyEvent e)
    {
    }
    
    
 }
}
