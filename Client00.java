import java.io.*;
import java.net.*;
class Client00
{
public static void main(String args[])throws IOException
{
Socket s=new Socket("localhost",6666);
System.out.println("connected to server");
BufferedReader br;
PrintStream ps;
String str;
System.out.println("Rubleen Kaur-07613203118");
System.out.println("Enter Radius :");
br=new BufferedReader(new InputStreamReader(System.in));
ps=new PrintStream(s.getOutputStream());
ps.println(br.readLine());
br=new BufferedReader(new InputStreamReader(s.getInputStream()));
str=br.readLine();
System.out.println("Area of the circle is : "+str);
br.close();
ps.close();
}
}
