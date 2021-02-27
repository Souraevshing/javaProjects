package gui.awt.frame.examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.Date;

class Frame_2 extends Frame
{
    Button b1,b2;
    public Frame_2(String title)
    {
        b1 = new Button("Tap to Close");
        b2 = new Button("Tap to Change Color");
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        add(b1);
        add(b2);
        super.setTitle(title);
        super.setSize(1200,800);
        super.setVisible(true);
        super.setBackground(Color.pink);
    }
}
public class Example_4
{
    public static void main(String ar[])
    {
       Frame_2 f = new Frame_2("Frame with Buttons");
        System.out.println(f);
    }
}
