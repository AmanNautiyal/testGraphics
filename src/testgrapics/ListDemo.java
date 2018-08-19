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
public class ListDemo 
{
 Frame mainFrame;
 Panel controlPanel;
 Label headerLabel;
 Label statusLabel1;
 Label statusLabel2;
 public ListDemo()
 {
  prepareGUI();
 }
 public static void main(String args[])
 {
  ListDemo dem= new ListDemo();
  dem.showListDemo();
 }
 private void prepareGUI()
 {
  mainFrame= new Frame("JAVA LIST DEMO");
  controlPanel= new Panel();
  headerLabel= new Label();
  statusLabel1= new Label();
  statusLabel2= new Label();
  mainFrame.setSize(600,600);
  mainFrame.setLayout(new GridLayout(4,1));
  mainFrame.addWindowListener(new WindowAdapter()
  {
   @Override
    public void windowClosing(WindowEvent e)
    {
     System.exit(0);
    }
  });
  headerLabel.setAlignment(Label.CENTER);
  statusLabel1.setAlignment(Label.CENTER);
  statusLabel2.setAlignment(Label.CENTER);
  statusLabel1.setSize(350,100);
  statusLabel2.setSize(350,100);
  headerLabel.setText("Choose subjects and one game");
  controlPanel.setLayout(new FlowLayout());
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel1);
  mainFrame.add(statusLabel2);
 }
 private void showListDemo()
 {
     List subjects=new List(6,true);
     List games=new List(6,false);
     subjects.add("Physics");
     subjects.add("Chemistry");
     subjects.add("Maths");
     subjects.add("Biology");
     subjects.add("Economics");
     subjects.add("Computer Science");
     games.add("Table Tennis");
     games.add("Badminton");
     games.add("Football");
     games.add("Cricket");
     games.add("Basketball");
     games.add("Volleyball");
     Button show=new Button("Show");
     show.addActionListener(new ActionListener()
     {
       @Override
       public void actionPerformed(ActionEvent e)
       {
        String data1="Subjects selected:";
        for(String subs:subjects.getSelectedItems())
          data1+=subs+",";
        String data2="\nGame selected: "+games.getItem(games.getSelectedIndex());
        statusLabel1.setText(data1);
        statusLabel2.setText(data2);
       }
     });
    controlPanel.add(subjects);
    controlPanel.add(games);
    controlPanel.add(show);
    mainFrame.setVisible(true);
 }
}
