class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 

        System.out.println("From custom");
    } 
} 

class ThrowExcep 
{ 
    static void fun() throws Exception
    { 
        
    
            throw new MyException("demo"); 
        

    } 
  
    public static void main(String args[]) 
    {       System.out.println("Rubleen Kaur");
    System.out.println("07613203118");
        try
        { 
            fun(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Caught in main. "+ e.getMessage()); 
        } 
        finally{
            System.out.println("finally");
        }
    } 
}