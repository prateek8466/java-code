import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="ChangeBackground.class" width=300 height=100>
</applet>
*/

public class ChangeBackground extends Applet implements ActionListener
{
Button Red,Blue,Green;
public void init()
{
Red = new Button("Red");
add(Red);
Red.addActionListener(this);
Blue = new Button("Blue");
add(Blue);
Blue.addActionListener(this);
Green = new Button("Green");
add(Green);
Green.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if (e.getSource() == Red)
{
setBackground(Color.red);
}
else if (e.getSource() == Blue)
{
setBackground(Color.blue);
}
else if (e.getSource() == Green)
{
setBackground(Color.green);
}
}
public void paint(Graphics g){ }
}