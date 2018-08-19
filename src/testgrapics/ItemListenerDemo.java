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
public class ItemListenerDemo
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel;
 public ItemListenerDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  ItemListenerDemo dem= new ItemListenerDemo();
  dem.showItemListenerDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA EVENT LISTENER DEMO");
  controlPanel= new Panel();
  headerLabel= new Label();
  statusLabel= new Label();
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.setSize(1000,1000);
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
  headerLabel.setText("Choose one:");
  statusLabel.setSize(350,100);
  controlPanel.setLayout(new FlowLayout()); 
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 }
 private void showItemListenerDemo()
 {
  Checkbox aman= new Checkbox("Aman");
  Checkbox aditi= new Checkbox("Aditi");
  aman.addItemListener(new CustomItemListener());
  aditi.addItemListener(new CustomItemListener());
  controlPanel.add(aman);
  controlPanel.add(aditi);
  mainFrame.setVisible(true);
 }
 private class CustomItemListener implements ItemListener
 {
   @Override
     public void itemStateChanged(ItemEvent e)
   {
    statusLabel.setText(e.getItem() + (e.getStateChange()==1?"checked":"unchecked"));
   }
 }
}
