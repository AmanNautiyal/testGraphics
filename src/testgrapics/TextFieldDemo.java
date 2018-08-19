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
public class TextFieldDemo
{
 Frame mainFrame;
 Panel controlPanel;
 Label statusLabel;
 Label headerLabel;
 public TextFieldDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  TextFieldDemo dem= new TextFieldDemo();
  dem.showTestFieldDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA TEXTFIELD DEMO");
  controlPanel= new Panel();
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
  controlPanel.setLayout(new FlowLayout());
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(350,100);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showTestFieldDemo()
 {
  headerLabel.setText("LOGIN PAGE");
  Label id =new Label("ID",Label.LEFT);
  Label password=new Label("PASSWORD",Label.LEFT);
  final TextField idtext=new TextField(6);
  final TextField psdtext=new TextField(6);
  psdtext.setEchoChar('*');
  Button login =new Button("LOGIN");
  login.addActionListener(new ActionListener()
  {
   @Override
   public void actionPerformed(ActionEvent e)
   {
    statusLabel.setText("User id:"+idtext.getText()+"\tPassord:"+psdtext.getText()); 
   }   
  });
  controlPanel.add(id);
  controlPanel.add(idtext);
  controlPanel.add(password);
  controlPanel.add(psdtext);
  controlPanel.add(login);
  mainFrame.setVisible(true);
 }
}
