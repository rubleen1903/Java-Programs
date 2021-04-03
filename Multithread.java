class MultithreadingDemo extends Thread 
{   int n;
    String a;
    MultithreadingDemo(int m,String b){
        this.n=m;
        this.a=b;
    }
	public void run() 
	{ try{
        while(true){
        System.out.println(a);
        sleep(n*1000);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
	} 
} 


class Multithread 
{ 
	public static void main(String[] args) 
	{ 
        System.out.println("Rubleen Kaur");
        System.out.println("07613203118");
            MultithreadingDemo ob1 = new MultithreadingDemo(1,"Good Morning");
            MultithreadingDemo ob2 = new MultithreadingDemo(2,"Hello");
            MultithreadingDemo ob3 = new MultithreadingDemo(3,"Welcome");
            
            ob1.start();
            ob2.start();
            ob3.start();
          } 
}
