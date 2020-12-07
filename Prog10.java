class Prog10{
 public static void main(String args[]) {

int maxNumber=Integer.parseInt(args[0]);

 System.out.println("List of the prime number between 1 - " + maxNumber);
 System.out.print("Series: ");
 for (int num = 2; num <= maxNumber; num++)
 {
 boolean isPrime = true;
 for (int i=2; i <= num/2; i++)
 {
 if ( num % i == 0)
 {
 isPrime = false;
 break;
 }
 }
 if ( isPrime == true )
 System.out.print(" "+num);
 }
 System.out.println("\n Pavneet Singh - 06613203118");
}
}
