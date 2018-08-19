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
public class TestListener
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 TextField text;
 public TestListener()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
   TestListener dem= new TestListener();
   dem.showTestListenerDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame();
  headerLabel= new Label();
  statusLabel =new Label();
  controlPanel= new Panel();
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
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(350,100);
  controlPanel.setLayout(new FlowLayout());
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showTestListenerDemo()
 {
  headerLabel.setText("JAVA TEXTLISTENER DEMO");
  text=new TextField(20);
  text.addTextListener(new CustomTextListener());
  Button b=new Button("SUBMIT");
  b.addActionListener(new ActionListener()
  {
    @Override
    public void actionPerformed(ActionEvent e)
    {
     statusLabel.setText("Submitted Text:"+text.getText());
    }
  });
  controlPanel.add(text);
  controlPanel.add(b);
  mainFrame.setVisible(true);
 }
 private class CustomTextListener implements TextListener
 {
  @Override
  public void textValueChanged(TextEvent e)
  {
   statusLabel.setText("Text Value Change:"+text.getText());
  }
 }
}
