import java.util.Scanner;
public class Prog9 {
    public static void main(String args[]) {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto " + number +" numbers : ");
        System.out.println("Using Iterative method");
        for(int i=0; i<=number; i++){
            if(i==number){
            System.out.println(fibonacci2(i) +" ");
        }
        }
        System.out.println("Using recursion");
        System.out.println(fibonacci(number-1));
		System.out.println("Pavneet Singh -06613203118");   
    } 
 
    //Recursive method
    public static int fibonacci(int number){
      
        
        if(number == 1|| number == 2){
            return 1;
       }
     
        return fibonacci(number-1) + fibonacci(number -2);          
    }
 
    //Iterative Method
    public static int fibonacci2(int number){

        
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=0, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){     
            fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci; 
        }
        return fibonacci;  
    }     
}
