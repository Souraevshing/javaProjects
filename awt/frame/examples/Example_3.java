package gui.awt.frame.examples;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

class Frame_1 extends Frame
{
    Frame_1(String title)
    {
        super.setTitle(title);
        super.setSize(1200,800);
        super.setVisible(true);
        super.setBackground(Color.pink);
    }
}
public class Example_3
{
    public static void main(String ar[])
    {
       Date d = new Date();
       Frame_1 f = new Frame_1(d.toString());
    }
}
