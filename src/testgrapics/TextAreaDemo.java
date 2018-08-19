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
public class TextAreaDemo
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public TextAreaDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  TextAreaDemo dem= new TextAreaDemo();
  dem.showTextAreaDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA TEXTAREA DEMO");
  controlPanel =new Panel();
  headerLabel= new Label();
  statusLabel= new Label();
  mainFrame.setSize(600,600);
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.addWindowListener(new WindowAdapter()
  {
   @Override
   public void windowClosing(WindowEvent e) 
   {
       System.exit(0);
   }
  });
  controlPanel.setLayout(new GridLayout(3,1));
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(350,100);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showTextAreaDemo()
 {
  Label comment= new Label();
  comment.setText("COMMENTS:");
  comment.setAlignment(Label.CENTER);
  TextArea cmttext =new TextArea("Comment here",5,3);
  Button submit=new Button("SUBMIT");
  submit.addActionListener(new ActionListener()
  {
   @Override
   public void actionPerformed(ActionEvent e)
   {
    statusLabel.setText("Comment Submitted:"+cmttext.getText());
   }
  });
  controlPanel.add(comment);
  controlPanel.add(cmttext);
  controlPanel.add(submit);
  mainFrame.setVisible(true);
 }
}
