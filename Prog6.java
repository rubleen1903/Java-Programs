class Prog6
{
public static void main(String args[])
{
     int i, number; 
     long Factorial = 1;
     number =Integer.parseInt(args[0]);
      for (i = 1; i <= number; i++)  {
			         Factorial = Factorial * i;}
		       System.out.format("\nFactorial of %d = %d\n", number, Factorial);
                      System.out.println("Pavneet Singh - 06613203118");
	}  
}
