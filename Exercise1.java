import java.util.Scanner;
public class Exercise1 {
   public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int i1 = str.charAt(index1);
        int i2 = str.charAt(index2);

        // Print out the results.
        System.out.println("Character at position "+index1+" is " +
            (char)i1);
        System.out.println("Character at position "+index2+" is " +
            (char)i2);
    }
}