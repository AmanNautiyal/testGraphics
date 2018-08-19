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
public class FileDialogDemo
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public FileDialogDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  FileDialogDemo dem= new FileDialogDemo();
  dem.showFileDialogDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame();
  controlPanel= new Panel();
  headerLabel= new Label();
  statusLabel= new Label();
  mainFrame.setSize(1000,1000);
  mainFrame.setTitle("JAVA FILE DIALOG DEMO");
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
   }
  });
  controlPanel.setLayout(new FlowLayout());
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  headerLabel.setText("File Dialog Box");
  statusLabel.setSize(350,100);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showFileDialogDemo()
 {
  FileDialog fd=new FileDialog(mainFrame,"Select File");
  Button file= new Button("Open File");
  file.addActionListener(new ActionListener()
  {
    @Override
    public void actionPerformed(ActionEvent e)
    {
     fd.setVisible(true);
     statusLabel.setText("File Selected:"+fd.getDirectory()+fd.getFile());
    }
  });
  controlPanel.add(file);
  mainFrame.setVisible(true);
 }
}
