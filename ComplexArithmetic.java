import java.util.Scanner;
 public class ComplexArithmetic
{		
	public static void main(String args[])
	{System.out.println("Rubleen Kaur 07613203118");
		int ch=0;
		float num1,num2,answer;		
		Complex cal = new Complex() ;
		Scanner input =  new Scanner(System.in);
 
		System.out.print("Enter the first Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		Complex Object1  = new Complex(num1,num2);
 
		System.out.print("Enter the Second Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		Complex Object2  = new Complex(num1,num2);
		
		do
		{
			System.out.println("1.Add");
			System.out.println("2.Subtract");			
			System.out.println("3.Multiplication");			
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.print("Choose ur choice:");
			ch = input.nextInt();
			
			switch(ch)
			{
				case 1:				
					cal.Add(Object1,Object2);
					break;				
				case 2:
					cal.Subtract(Object1,Object2);
					break;
				case 3:				
					cal.Multiply(Object1,Object2);
					break;				
				case 4:				
					cal.Divide(Object1,Object2);
					break;				
				case 5:				
					break;				
			}
		}while(ch!=5);			
	}
}
 

class Complex
{
	private float real,imag;	
	Complex()
	{
		real=0;
		imag=0;
	}
	Complex(float Comp1,float Comp2)
	{
		real=Comp1;
		imag=Comp2;
	}	
	

	void  Add(Complex C1,Complex C2)
	{
		float real,imag;
		this.real = (C1.real + C2.real); 
		this.imag = (C1.imag + C2.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );		
	}
	

	void Subtract(Complex C1,Complex C2)
	{
		float real,imag;
		this.real = (C1.real - C2.real); 
		this.imag = (C1.imag - C2.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );		
	}
	

	void Multiply(Complex C1,Complex C2)
	{
		float real,imag;
		this.real = (C1.real*C2.real - C1.imag*C2.imag); 
		this.imag = (C1.real*C2.imag + C2.real*C1.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );	
	}
	

	void Divide(Complex C1,Complex C2)
	{
		float real,imag,denom;
		denom = (C2.real*C2.real + C2.imag*C2.imag);
		this.real = (C1.real*C2.real + C1.imag*C2.imag)/denom; 
		this.imag = (C2.real*C1.imag - C1.real*C2.imag)/denom;
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );	
	}
}
