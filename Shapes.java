import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

//Rubleen Kaur - 07613203118

public class Shapes extends Applet implements ActionListener{
  TextField tf,tfe;
  Button draw;
  String shape = "";
  String col="";
  

  public void init(){
    tf = new TextField(10);
    draw = new Button("Draw");
    draw.addActionListener(this);
    add(tf);
    add(draw);
   tfe = new TextField(10);
    draw = new Button("Color");
    draw.addActionListener(this);
    add(tfe);
    add(draw);
  
 
  }

  public void actionPerformed(ActionEvent e) {
    shape = tf.getText();
    col = tfe.getText();
    repaint();
  }

  public void paint(Graphics g){
    super.paint(g);
    if (col.equals("red")){
            g.setColor(Color.red);
        }
        else if(col.equals("green")){
            g.setColor(Color.green);
        }
        else if(col.equals("blue")){
            g.setColor(Color.blue);
        }
        else if(col.equals("pink")){
                g.setColor(Color.pink);
        }
    
    if ((shape.equals("rectangle")) || (shape.equals("RECTANGLE")))
    { 
      g.drawRect(30,30,50,60);
      g.fillRect(30,30,180,80);
    }
    else if ((shape.equals("circle")) || (shape.equals("CIRCLE")))
    {
      g.drawOval(30, 30, 50, 60);
      g.fillOval(30,30,50,60);
    }
    else if ((shape.equals("square")) || (shape.equals("SQUARE")))
    {
      g.drawRect(30,30,80,80);
      g.fillRect(30,30,80,80);
    }
   else {
}
  }
}