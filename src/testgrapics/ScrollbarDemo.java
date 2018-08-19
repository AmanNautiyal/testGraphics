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
public class ScrollbarDemo
{
 Frame mainFrame;
 Label headerLabel;
 Label statusLabel;
 Panel controlPanel;
 public ScrollbarDemo()
 {
   prepareGUI();
 }
 public static void main(String args[])
 {
     ScrollbarDemo dem= new ScrollbarDemo();
     dem.showScrollbarDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA SCROLLBAR EXAMPLE");
  controlPanel= new Panel();
  headerLabel =new Label();
  statusLabel=new Label();
  controlPanel.setLayout(new FlowLayout());
  headerLabel.setAlignment(Label.CENTER);
  statusLabel.setAlignment(Label.CENTER);
  statusLabel.setSize(350,100);
  mainFrame.setLayout(new GridLayout(3,1));
  mainFrame.setSize(1200,1200);
  mainFrame.addWindowListener(new WindowAdapter()
  {
   @Override
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
   }
  });
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);        
 }
 private void showScrollbarDemo()
 {
  headerLabel.setText("Scrollbars are below");
  Scrollbar hs=new Scrollbar(Scrollbar.HORIZONTAL);
  Scrollbar vs=new Scrollbar(Scrollbar.VERTICAL);
  hs.setMinimum(0);
  vs.setMinimum(0);
  hs.setMaximum(50);
  vs.setMaximum(50);
  hs.addAdjustmentListener(new Adjl(hs,vs));
  vs.addAdjustmentListener(new Adjl(hs,vs));
  controlPanel.add(hs);
  controlPanel.add(vs);
  mainFrame.setVisible(true);
 }
 private class Adjl implements AdjustmentListener
 {
  Scrollbar h,v;
  public Adjl(Scrollbar hs,Scrollbar vs)
  {
     h=hs;
     v=vs;
  }
  @Override
  public void adjustmentValueChanged(AdjustmentEvent e)
  {
   statusLabel.setText("Horizontal:"+h.getValue()+"\tVertical:"+v.getValue());
  }
 }
}
