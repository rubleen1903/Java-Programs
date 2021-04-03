
import java.util.*;
public class Static{
	
	int length;  
    int breadth;  
    static int  height=0;  
    //static method to change the value of static variable  
    static void change(){  
     height=20 ;
    }  
    //constructor to initialize the variable  
    Static(int length, int breadth){  
    this.length=length;
    this.breadth=breadth;
    }  
   
    //method to display values  
    void display(){System.out.println(length+" "+" "+breadth+" "+height);} 
	 
 public static void main(String[] args) {
System.out.println("Rubleen Kaur-07613203118");
	Static s1 = new Static(10,20);
	s1.display();
	change();
	s1.display();
 }
}
