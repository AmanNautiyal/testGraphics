/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgrapics;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
/**
 *
 * @author Aman Nautiyal
 */
public class ImageDemo
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 public ImageDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  ImageDemo dem= new ImageDemo();
  dem.showImageDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA IMAGE DEMO");
  headerLabel= new Label();
  statusLabel= new Label();
  controlPanel= new Panel();
  mainFrame.setSize(1200,1200);
  mainFrame.setLayout(new FlowLayout());
  mainFrame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
   }
  });
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  headerLabel.setText("Image appears here");
  controlPanel.setLayout(new FlowLayout());
  controlPanel.setSize(600,800);
  headerLabel.setSize(60,80);
  headerLabel.setBackground(Color.red);
  statusLabel.setSize(60,500);
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 mainFrame.setVisible(true);
 }
 private void showImageDemo()
 {
  controlPanel.add(new ImageComponent("C:/Good stuff/wallpapers/New folder (2)/426080.jpg"));
  mainFrame.setVisible(true);
 }    
 class ImageComponent extends Component
 {
   BufferedImage img;
   @Override
   public void paint(Graphics g)
   {
    g.drawImage(img,0,0,null);
   }
   public ImageComponent(String path)
   {
    try
    {
        img=ImageIO.read(new File(path));
        statusLabel.setText("File loading successful");
    }
    catch(IOException e)
    {
     statusLabel.setText("Input/Output error occurred\n"+e.getMessage());
    }
   }
   public Dimension getPreferredSize()
   {
    if(img==null)
        return new Dimension(100,100);
    else
        return new Dimension(img.getWidth(),img.getHeight());
   }
 }
}
