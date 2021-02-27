package gui.awt.frame.examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class Frame_6 extends Frame implements ActionListener
{
    int s = 0;
    Button b1,b2;
    public Frame_6(int s)
    {
        b1 = new Button("Click to start counter");
        b2 = new Button("QUIT");
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        add(b1);
        add(b2);
        
        super.setSize(400,400);
        super.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
            System.exit(0);
        if(ae.getSource()==b1)
            s++;
            super.setTitle(String.valueOf(s));
    }
}
public class Exercise_1
{
     static int c=0;
    public static void main(String ar[])
    {
       Frame_6 f = new Frame_6(c);
    }
}
