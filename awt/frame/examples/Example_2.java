package gui.awt.frame.examples;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

public class Example_2
{
    public static void main(String ar[])
    {
       Frame f = new Frame();
       Date d = new Date();
       f.setTitle(d.toString());
       f.setSize(1200,800);
       f.setVisible(true);
       f.setBackground(Color.pink);
    }
}
