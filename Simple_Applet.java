import java.applet.*;
import java.awt.*;
import java.net.*;

/* <applet code = "Simple_Applet" width=100 height=100>
</applet> */
public class Simple_Applet extends Applet
{
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
}
public void paint(Graphics g)
{
g.drawString("A SIMPLE APPLET", 100, 200);
}
}
