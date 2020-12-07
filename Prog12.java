import java.util.Scanner;
class factorial{
    int n;
    int f;

    factorial(){
        n=1;
        f=1;
    }
    factorial(int num){  //Parameterised constructor
        n=num;
        f=1;
    }
    factorial(factorial c){  //Copy Constructor
        this.n=c.n;
        this.f=c.f;
    }
   


    public void calculate(){
        
        while(n>1)

            f*=n--;
    }


}

class Prog12
{
     
  public static void main(String args[])
  {
System.out.println("Pavneet Singh 06613203118");
    System.out.println("Default Const.");
    factorial f1= new factorial();
    
    System.out.println(f1.f);
    
    System.out.println("Parameterised Const.");
    factorial f2 =new factorial(6);
    f2.calculate();
    System.out.println(f2.f);

    System.out.println("Copy Const.");
    factorial f3=f2;
    System.out.println(f3.f);
}}
