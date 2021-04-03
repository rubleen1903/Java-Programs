interface Drawable{
void draw();
}

class Rectangle implements Drawable{
public void draw(){System.out.println("drawing rectangle");}
}

class Circle implements Drawable{
public void draw(){System.out.println("drawing circle");}
}

class TestInterface{
public static void main(String args[]){
System.out.println("Rubleen Kaur - 07613203118");
Drawable d=new Circle();
d.draw();
//Drawing rectangle with the same reference variable
d = new Rectangle();
d.draw();
}
}
