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
public class JavaButtonDemo
{
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    public JavaButtonDemo()
    {
        prepareGUI();
    }
    public static void main(String args[])
    {
     JavaButtonDemo dem=new JavaButtonDemo();
     dem.showButtonDemo();
    }
    private void prepareGUI()
    {
     mainFrame=new Frame();
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
     headerLabel=new Label();
     statusLabel=new Label();
     controlPanel=new Panel();
     headerLabel.setAlignment(Label.CENTER);
     statusLabel.setAlignment(Label.CENTER);
     statusLabel.setSize(350,100);
     controlPanel.setLayout(new FlowLayout());
     mainFrame.add(headerLabel);
     mainFrame.add(statusLabel);
     mainFrame.add(controlPanel);
     mainFrame.setVisible(true);
    }
    private void showButtonDemo()
    {
       headerLabel.setText("Button Demo");
       Button ok=new Button("OK");
       Button submit=new Button("Submit");
       Button cancel=new Button("Cancel");
       ok.addActionListener(new ActionListenerImpl(1));
       submit.addActionListener(new ActionListenerImpl(2));
       cancel.addActionListener(new ActionListenerImpl(3));
       controlPanel.add(ok);
       controlPanel.add(submit);
       controlPanel.add(cancel);
       
    }

    private class ActionListenerImpl implements ActionListener {
        int x;

        public ActionListenerImpl(int i) {
            x=i;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
         switch(x)
         {
             case 1:
            statusLabel.setText("OK button clicked");break;
            case 2:
            statusLabel.setText("Submit button clicked");break;
            case 3:
            statusLabel.setText("Cancel button clicked");break;
         }
        }
    }
       
    }

