


class Factorial{
    int n;
    int f;

    Factorial(){
        n=1;
        f=1;
    }
    Factorial(int num){
        n=num;
        f=1;
    }
    Factorial(Factorial c){
        this.n=c.n;
        this.f=c.f;
    }
    // Factorial(int n,int f){

    // }


    public void calculate(){
        
        while(n>1)f*=n--;
    }


}

class Fact
{
     
  public static void main(String args[])
  {
    
    Factorial f1= new Factorial();
    
    System.out.println(f1.f);

    Factorial f2 =new Factorial(5);
    f2.calculate();
    System.out.println(f2.f);

    Factorial f3=f2;
    System.out.println(f3.f);
    

}


}