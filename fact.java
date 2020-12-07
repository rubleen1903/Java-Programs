import java.util.*;
public class fact{
     
	public static void main(String[] args) {
		int i, num; 
                Scanner in = new Scanner(System.in);
		long Factorial = 1;
		  num = in.nextInt();
		
		for (i = 1; i <= num; i++)  {
			Factorial = Factorial * i;
		}
		System.out.format("\nFactorial of %d = %d\n", num, Factorial);
	}
}