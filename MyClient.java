
import java.io.*;
import java.net.*;

public class MyClient {
public static void main(String[] args) {
try{	
Socket s=new Socket("localhost",6666);//IP address and Portnumber
System.out.println("connected to server");
	
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("Client Accepted \n Client-Server Application by third group");
dout.flush();

dout.close();
s.close();

}catch(Exception e){System.out.println(e);}
}
}
