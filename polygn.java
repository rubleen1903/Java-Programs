import java.util.*;
interface polygon
{
	int getNumberofSides();
	double getSideLength();
	void computeArea();
}
class EquiTriangle implements polygon
{
	double res,area,l,length;
	EquiTriangle(double a)
	{
		length=a;
	}
	public int getNumberofSides()
	{
		return 3;
	}
	public double getSideLength()
	{
		return length;
	}
	public void computeArea()
	{
		l=getSideLength();
		res=0.4330127019*l*l;
	System.out.println("Sides of Equilateraltriangle :"+getNumberofSides());
	System.out.println("Area of Equilateraltriangle :"+res);
	}
}
class Rectangle implements polygon
{
	double res,area,l,length,bredth,b;
	Rectangle(double a)
	{
		length=a;
	}
	public int getNumberofSides()
	{
		return 4;
	}
	public double getSideLength()
	{
		return length;
	}
	public void computeArea()
	{
		l=getSideLength();
		res=l*l;
	System.out.println("Sides of Rectangle :"+getNumberofSides());
	System.out.println("Area of Rectangle :"+res);
	}
}
class polygn
{
	public static void main(String args[])
	{
		double length,lentri;
		Scanner sc=new Scanner(System.in);
                Systen.out.println("Program made by Kabir Singh ");
		System.out.print("Enter side of the triangle: ");
		lentri=sc.nextDouble();
		EquiTriangle tri= new EquiTriangle(lentri);
		tri.computeArea();
		System.out.println("=======================================");
		System.out.print("Enter length of the rectangle: ");
		length=sc.nextDouble();
		Rectangle rec = new Rectangle(length);
		rec.computeArea();
	}
