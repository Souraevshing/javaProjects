
package gui.awt.frame.examples;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

public class Example_1
{
    public static void main(String ar[])
    {
        Date d = new Date();
        Frame f = new Frame();
        f.setTitle("The Today's Date is :"+" "+d.toString()+" "+"My First Frame Demo");
        Color c = new Color(60,40,90);
        f.setBackground(c);
        f.setSize(1200, 600);
        f.setVisible(true);
    }
}
