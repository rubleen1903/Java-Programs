
 
/*
<applet code="FilledRectangleExample" width=200 height=200>
</applet>
*/
 
 
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class FillRectangleExample extends Applet{
 
 public void paint(Graphics g){
 
 //set color to red
 setForeground(Color.red);
 
 /*
 * to draw a filled rectangle in an applet window use,
 * void fillRect(int x1,int y1, int width, int height)
 * method.
 */
 
 //this will draw a filled rectangle of width 50 & height 100 at (10,10)
 g.fillRect(10,10,50,100);
 

 g.fillRect(100,100,50,50);
 }
 
}