package gui.awt.frame.examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class Frame_4 extends Frame implements ActionListener
{
    Button b1,b2;
    public Frame_4(String title)
    {
        b1 = new Button("Tap to Close");
        b2 = new Button("Say hello to Saurav");
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        add(b1);
        add(b2);
        super.setTitle(title);
        super.setSize(1200,800);
        super.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
            System.exit(0);
        else
            System.out.println("Hello Saurav!!!");
    }
}
public class Example_6
{
    public static void main(String ar[])
    {
       Frame_4 f = new Frame_4("Two Buttons ");
    }
}
