import java.applet.*;
	import java.awt.*;
	import java.awt.Button;
	import java.awt.event.*;
	import java.util.ArrayList;

public class JavaFinal extends Applet implements MouseListener,MouseMotionListener {
	
	Button Erase;
	Button Freehand;
	Button Clear ;
	Button Undo;
	
	
	Button red;
	Button blue;
	Button green;
		
		
	int red_flag=0;
	int blue_flag=0;
	int green_flag=0;
		
		
	Button L;
	Button C;
	Button R;
		
	int R_flag=0;
	int C_flag=0;
	int L_flag=0;
		
	Checkbox solid;
		
	boolean flag;
	int flagcolor=0;
	int flagtype=0;
	int flagsolid=0;
	int flagerase=0;
	int flagfree=0;
	
	
	
		
	int x1;
	int y1; 
	int x2;
	int y2;
		
	public ArrayList<Shape>Myarray =new ArrayList<>();   
	public ArrayList<Rec>erasearray =new ArrayList<>();
	public ArrayList<Line>freearray =new ArrayList<>();
	
	//Parent
	public class Shape {	
    int x1;
	int y1;
	int x2;
	int y2;
    int type;
	int color;
	int Solid2;
	
	public void setSolid(int c){
		Solid2=0;
	}
	public int getSolid(){
		return Solid2;
	}
	
	
	public void setCol(int c){
		color=c;
	}
	public int getCol(){
		return color;
	}
	
	
	public void setX1(int x){
		x1=x;
	}
	public int getX1(){
		return x1;
	}
	
	public void setY1(int y){
		y1=y;
	}
	public int getY1(){
		return y1;
	}
	
	public void setX2(int xx){
		x2=xx;
	}
	public int getX2(){
		return x2;
	}
	
	public void setY2(int yy){
		y1=yy;
	}
	public int getY2(){
		return y2;
	}
	
	public Shape(){
		x1=0;
	    y1=0;
		x2=0;
	    y2=0;
	    type=0;
	    color=0;
	    Solid2=0;
	}
	
	public Shape(int xx1 , int yy1 ,int xx2, int yy2, int t, int c , int s  ){
		x1=xx1;
	    y1=yy1;
		x2=xx2;
	    y2=yy2;
	    type=t;
	    color=c;
	    Solid2=s;
	}
	
	 
	public int getType(){
		return type;
	}	


	public void setType(int t){
		type=t;
	}

}


//Line child
    class Line extends Shape{
         	public Line(){

	}
	public Line(int st1,int en1,int st2,int en2,  int t, int c , int s  ){
		super(st1, en1, st2, en2, t, c, s);
	}
	
	
	public void draw(Graphics g){
		g.drawLine(x1,y1,x2-x1,y2-y1);
	}

}	


//Circle child
    class Circle extends Shape{
     	public Circle(){

	}
	public Circle(int st1,int en1,int st2,int en2,  int t, int c , int s ){
         super(st1, en1, st2, en2, t, c, s);
	}
	
    public void draw(Graphics g){
		g.drawOval(x1,y1,x2-x1,y2-y1);
	}
	
}	

//Rec child
    class Rec extends Shape{
         	public Rec(){

	}
	public Rec(int st1,int en1,int st2,int en2,  int t, int c , int s ){
         super(st1, en1, st2, en2, t, c, s);
	}
	
     public void draw(Graphics g){
		g.drawRect(x1,y1,x2-x1,y2-y1);
	}
	
	

}


	    ////////////Buttons & mouse
		public void init(){
		  addMouseListener(this);
		  addMouseMotionListener(this);
		  
		Erase = new Button("Eraser");
		Erase.addActionListener(new ButtonListener_E());
		add(Erase);
		
		Freehand = new Button("Freehand");
		Freehand.addActionListener(new ButtonListener_FF());
		add(Freehand);
		
		Clear = new Button("Clear all");
		Clear.addActionListener(new ButtonListener_clear());
		add(Clear);
		
		Undo = new Button("Undo");
		Undo.addActionListener(new ButtonListener_F());
		add(Undo);
		  
		  
		  
		red = new Button("red");
		red.setBackground(Color.red);
		red.addActionListener(new ButtonListener_red());
		add(red);
		
		blue = new Button("blue");
		blue.setBackground(Color.blue);
		blue.addActionListener(new ButtonListener_blue());
		add(blue);
		
		green = new Button("green");
		green.setBackground(Color.green);
		green.addActionListener(new ButtonListener_green());
		add(green); 
		 
		L = new Button("Line");
		L.addActionListener(new ButtonListener_L());
		add(L);
		
		C = new Button("Circle");
		C.addActionListener(new ButtonListener_C());
		add(C);
		
		R = new Button("Rec");
		R.addActionListener(new ButtonListener_R());
		add(R);

		solid=new Checkbox("solid");
		solid.addItemListener(new MyCheckBoxListener());
		add(solid);
		}
		
		
		
		public void paint(Graphics g){
		
		if (flagcolor==1)
		{
			g.setColor(Color.red);
		}
		else if(flagcolor==2){
			g.setColor(Color.blue);
			}
		else if(flagcolor==3){
			g.setColor(Color.green);
			}	
			
			
		for (int i=0; i<Myarray.size();i++)	{
			
			
			int y=Myarray.get(i).getCol();
			if (y==1){
				g.setColor(Color.red);
			}
			else if(y==2){
				g.setColor(Color.blue);
			}
			else if(y==3){
				g.setColor(Color.green);
			}
		
		//line
			if (Myarray.get(i).getType()==1){
				g.drawLine(Myarray.get(i).x1,Myarray.get(i).y1,Myarray.get(i).x2,Myarray.get(i).y2);
			}
			
			
			//circle
			else if(Myarray.get(i).getType()==2){
				if(Myarray.get(i).getSolid()==1){ // solid,checked
					g.fillOval(Myarray.get(i).x1,Myarray.get(i).y1,Myarray.get(i).x2 - Myarray.get(i).x1,Myarray.get(i).y2 - Myarray.get(i).y1);
				}
				g.drawOval(Myarray.get(i).x1,Myarray.get(i).y1,Myarray.get(i).x2 - Myarray.get(i).x1,Myarray.get(i).y2 - Myarray.get(i).y1);
			}
		
			//rectangle
			else if(Myarray.get(i).getType()==3){
					if(Myarray.get(i).getSolid()==1){
						g.fillRect(Myarray.get(i).x1,Myarray.get(i).y1,Myarray.get(i).x2 - Myarray.get(i).x1,Myarray.get(i).y2 - Myarray.get(i).y1);
					}
					g.drawRect(Myarray.get(i).x1,Myarray.get(i).y1,Myarray.get(i).x2 - Myarray.get(i).x1,Myarray.get(i).y2 - Myarray.get(i).y1);
			}
			
			
		}
		//Freehand
		for (int i=0; i<freearray.size();i++){
			int y=freearray.get(i).getCol();
			if (y==1){
				g.setColor(Color.red);
			}
			else if(y==2){
				g.setColor(Color.blue);
			}
			else if(y==3){
				g.setColor(Color.green);
			}
			
	    g.drawLine(freearray.get(i).x1,freearray.get(i).y1,freearray.get(i).x2,freearray.get(i).y2);
			
		}
		//Eraser
		for (int i=0; i<erasearray.size();i++){
			
	    g.fillRect(erasearray.get(i).x1,erasearray.get(i).y1,10,10);
			g.setColor(Color.white);
			
		}
		
		switch(flagtype){
			case 1 : 
				g.drawLine(x1,  y1 , x2 ,  y2);
			break;
			
			case 2 :
				if(flagsolid==1)
				{g.fillOval(x1,  y1 , x2 - x1 ,  y2 - y1);}
				g.drawOval(x1, y1 , x2 - x1 ,  y2 - y1);
			break;
			
			case 3 :
				if(flagsolid==1)
				{g.fillRect(x1,  y1 , x2 - x1 ,  y2 - y1);}
				g.drawRect(x1, y1 , x2 - x1 ,  y2 - y1);
			break;
			
			default:
			break;
		}
		}
		
	///////	///////////////////////////////	
		public void mousePressed(MouseEvent e){
			x1=e.getX();
			y1=e.getY();
		}
		
				
		public void mouseDragged(MouseEvent e){
			flag=true;
			
			if (flagfree==1){
				Line L;
				L=new Line(x1,y1,e.getX(),e.getY(),flagtype,flagcolor,flagsolid );
				freearray.add(L);
				x1=e.getX();
				y1=e.getY();
			}
			
			if (flagerase==1){
				Rec c;
				c=new Rec(x1,y1,10,10,flagtype,5,1 );
				erasearray.add(c);
				x1=e.getX();
				y1=e.getY();
			}
			if ((flagtype==1)||(flagtype==2)||(flagtype==3)){
			
			x2=e.getX();
			y2=e.getY();
			
			}
			
				repaint();
			
		}
		
		public void mouseReleased(MouseEvent e)
		{   
			if(flag==true)
			{
				x2=e.getX();
				y2=e.getY();
				repaint();
				
				Shape firstshape;
				
				if(flagtype==1)		
				{
					firstshape=new Line(x1,y1,e.getX(),e.getY(),flagtype,flagcolor,flagsolid );
					Myarray.add(firstshape);
					
				}
				else if (flagtype==2)
				{
					firstshape=new Circle(x1,y1,e.getX(),e.getY(),flagtype,flagcolor,flagsolid );
					Myarray.add(firstshape);
				}
				
				else if(flagtype==3)
				{
					firstshape=new Rec(x1,y1,e.getX(),e.getY(),flagtype,flagcolor,flagsolid );
					Myarray.add(firstshape);
				}
				
				System.out.println(" shape added");
				
			}	
		}
		
		public void mouseMoved (MouseEvent e){}
		public void mouseClicked (MouseEvent e){}
		public void mouseEntered (MouseEvent e){}
		public void mouseExited (MouseEvent e){}
		
		class ButtonListener_E implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagtype=0;
			flagcolor=0;
		    red_flag=0;
	        blue_flag=0;
	        green_flag=0;
		    R_flag=0;
	        C_flag=0;
	        L_flag=0;
			flagfree=0;
		
			flagerase=1;
			
			
			}
		}
		
		class ButtonListener_FF implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagtype=0;
		    R_flag=0;
	        C_flag=0;
	        L_flag=0;
			flagerase=0;
		
			flagfree=1;
			
			
			}
		}
		
		class ButtonListener_clear implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagtype=0;
			flagcolor=0;
		    red_flag=0;
	        blue_flag=0;
	        green_flag=0;
		    R_flag=0;
	        C_flag=0;
	        L_flag=0;
		
			Myarray.clear();
			freearray.clear();
			repaint();
			}
		}
		class ButtonListener_F implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagtype=0;
		    red_flag=0;
	        blue_flag=0;
	        green_flag=0;
			flagcolor=0;
		    R_flag=0;
	        C_flag=0;
	        L_flag=0;
		
			Myarray.remove(Myarray.size()-1);
			
			repaint();
			}
		}
		

		class ButtonListener_red implements ActionListener{
			public void actionPerformed(ActionEvent ev){
				
			flagcolor=1;
			red_flag=1;
		    blue_flag=0;
		    green_flag=0;
			
			}
		}
		
		class ButtonListener_blue implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagcolor=2;
			red_flag=0;
		    blue_flag=1;
		    green_flag=0;
			}
		}
		
		class ButtonListener_green implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagcolor=3;
			red_flag=0;
		    blue_flag=0;
		    green_flag=1;
			}
		}
		
		class ButtonListener_L implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagtype=1;
			R_flag=0;
		    C_flag=0;
		    L_flag=1;
			flagerase=0;
			flagfree=0;
			
			
			}
		}
		
		class ButtonListener_C implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagtype=2;
			R_flag=0;
		    C_flag=1;
		    L_flag=0;
			flagerase=0;
			flagfree=0;
			
			}
		}
		
		class ButtonListener_R implements ActionListener{
			public void actionPerformed(ActionEvent ev){
			flagtype=3;
			R_flag=1;
		    C_flag=0;
		    L_flag=0;
			flagerase=0;
			flagfree=0;
			
			}
		}
		
		class MyCheckBoxListener implements ItemListener{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					
					flagsolid=1; //Checked
				}
				else{
					flagsolid=0; //unchecked
				}
			}
		}
		
	}
