
import java.io.*;
import java.net.*;

class UDPserver {
  public static void main(String args[]) throws Exception
    {

      DatagramSocket serverSocket = new DatagramSocket(1234);
     
System.out.println("Server started");
System.out.println("Waiting for client....");

      byte[] receiveData = new byte[1024];
      byte[] sendData  = new byte[1024];

      while(true)
        {

          DatagramPacket receivePacket =
             new DatagramPacket(receiveData, receiveData.length);

          serverSocket.receive(receivePacket);

          String sentence = new String(receivePacket.getData());
  System.out.println("Sent from the client: "+sentence);

          InetAddress IPAddress = receivePacket.getAddress();

          int port = receivePacket.getPort();

                      String capitalizedSentence = sentence.toUpperCase();

          sendData = capitalizedSentence.getBytes();

          DatagramPacket sendPacket =
             new DatagramPacket(sendData, sendData.length, IPAddress,
                               port);
         

          serverSocket.send(sendPacket);
        
        }
    }
}
