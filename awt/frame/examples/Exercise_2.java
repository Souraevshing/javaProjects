package gui.awt.frame.examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Frame_7 extends Frame implements ActionListener
{
    
         Button b1,b2;
         Random r = new Random();
    public Frame_7(String title)
    {
        b1 = new Button("Change Color");
        b2 = new Button("QUIT");
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        add(b1);
        add(b2);
        super.setTitle(title);
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
        {
            int red = r.nextInt(256);
            int green = r.nextInt(256);
            int blue = r.nextInt(256);
            Color c = new Color(red,green,blue);
            super.setBackground(c);
        }
    }
}
public class Exercise_2
{
    public static void main(String ar[])
    {
       Frame_7 f = new Frame_7("Random Color Picker");
    }
}
