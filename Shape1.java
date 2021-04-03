import java.util.Scanner;
 
 abstract class Shape{

	abstract void noOfSides();
		
	

}

class Triangle extends Shape{
	void noOfSides(){
		System.out.println("No of Sides are 3 in a triangle");
	}

}

 class Rectangle extends Shape{
	void noOfSides(){
		System.out.println("No. of Sides are 4 in a rectangle");	}

}

 class  Hexagon extends Shape{

	void noOfSides(){
		System.out.println("No. of sides are 6 in a hexagon");

	}

}

 public class Shape1{
	public static void main(String args[]){
System.out.println("Rubleen Kaur - 07613203118");
		
		Shape s;

		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Hexagon h = new Hexagon();

		Scanner sc = new Scanner(System.in);


		System.out.print("Enter your choice: \n 1. For Triangle\n2. For Rectangle\n3. For Hexagon");
        int ch = sc.nextInt();



		switch(ch){
			case 1:
			s = new Triangle();
			s.noOfSides();
			break;
			

			case 2:
			s = new Rectangle();
			s.noOfSides();
			break;

			case 3:

			s = new Hexagon();
			s.noOfSides();
			break;

			default:
			System.out.println("Enter the correct no.");
			break;
		
		}
		}
}

