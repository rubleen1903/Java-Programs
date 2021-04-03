import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 /* <applet code = "menushape" width=100 height=100>
</applet>*/
class MenuFrame extends Frame implements ActionListener {
    String col;
        int shape;
 
    public MenuFrame(String title) {
        super(title);
            MenuBar mbar=new MenuBar();
        setMenuBar(mbar);
         
        Menu shape=new Menu("shape");
        MenuItem item1,item2,item3;
        shape.add(item1 =new MenuItem("Rectangle"));
        shape.add(item2 =new MenuItem("Circle"));
        shape.add(item3 =new MenuItem("square"));
        mbar.add(shape);
         
        Menu color=new Menu("color");
        MenuItem item5,item6,item7,item8;
        color.add(item5= new MenuItem("red"));
        color.add(item6= new MenuItem("green"));
        color.add(item7= new MenuItem("blue"));
        color.add(item8= new MenuItem("pink"));
        mbar.add(color);
 
        item1.addActionListener(this);
            item1.addActionListener(this);
            item2.addActionListener(this);
            item3.addActionListener(this);
            item5.addActionListener(this);
            item6.addActionListener(this);
            item7.addActionListener(this);
            item8.addActionListener(this);
    }
     
    public void paint(Graphics g){
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
             
        switch(shape){
            
            case 1:
                g.drawRect(100,100,200,500);
                g.fillOval(100,100,200,500);
                break;
            case 2:
                g.drawOval(100,100,100,100);
                g.fillOval(100,100,100,100);
                break;      
            case 3:
                    g.drawOval(30, 30, 50, 60);
      
                    g.fillOval(30,30,50,60);
   
        }
    }
     
    public void actionPerformed(ActionEvent ae){
        String msg="You selected";
        String arg=(String)ae.getActionCommand();
         
        if(arg.equals("red")){
                col="red";
            }
                else if(arg.equals("blue")){
            col="blue";
            }
            else if(arg.equals("green")){
            col="green";
            }
            else if (arg.equals("pink")){
            col="pink";
            }         
         
        repaint();
 
            if(arg.equals("Rectangle"))
                shape=1;
            else if(arg.equals("Circle"))
                shape=2;
            else if(arg.equals("square"))
                shape=3;
           
        repaint();
        }
    }
     
public class menushape extends Applet  {
    MenuFrame mf;
     
    public void init() {
            MenuFrame mf=new MenuFrame("my frame");
            mf.setVisible(true);
            mf.setSize(200,200);
    }
}