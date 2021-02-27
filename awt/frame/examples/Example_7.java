package gui.awt.frame.examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class Frame_5 extends Frame
{
    Button b1,b2;
    public Frame_5(String title)
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
         ActionListener2 l1 = new ActionListener2();
        ActionListener2 l2 = new ActionListener2();
        b1.addActionListener(l1);
        b2.addActionListener(l2);
    }
}

class ActionListener1 implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ae)
    {
            System.exit(0);
    }
}

class ActionListener2 implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ae)
    {
            System.out.print("Hello Saurav!!!");
    }
}

public class Example_7
{
    public static void main(String ar[])
    {
       Frame_4 f = new Frame_4("Two Buttons ");
    }
}
