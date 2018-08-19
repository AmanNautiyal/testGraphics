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
public class CardLayoutDemo
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 public CardLayoutDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  CardLayoutDemo dem=new CardLayoutDemo();
  dem.showCardLayoutDemo();
 }
 private void prepareGUI()
 {
  mainFrame=new Frame("JAVA CARD LAYOUT DEMO");
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
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(300,100);
  
 }
 }
}
