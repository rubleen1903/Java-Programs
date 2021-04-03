
import java.util.Scanner;
public class alpha {
   public static void main(String [] args)
{
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int val = num;
    for(int i=1;i<=num;i++,val--)
    {    
        for(int j=1; j<=num-i+1;j++)
        {
            System.out.print(val);
            
        }
        System.out.println();
    }
    sc.close();
}

}