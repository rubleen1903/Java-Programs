import java.util.Scanner;  
   
class LinearSearch 
{  
  public static void main(String args[])  
  {  
    int c, n, search, array[];  
   
    Scanner in = new Scanner(System.in);  
    System.out.println("Array Size: ");  
    n = in.nextInt();   
    array = new int[n];  
    for (c = 0; c < n; c++)  
      array[c] = in.nextInt();  
   
    System.out.println("Search Element: ");  
    search = in.nextInt();  
   
    for (c = 0; c < n; c++)  
    {  
      if (array[c] == search)      
      {  
         System.out.println("Element "+search + " is present in " + (c + 1) + " position.");  
          break;  
      }  
   }  
   if (c == n)    
      System.out.println("Element"+search + " isn't present in array.");  
  }  
}