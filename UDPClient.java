import java.io.*;
import java.net.*;
class UDPclient {
    public static void main(String[] args) throws Exception{
        BufferedReader inFromUser;
        DatagramSocket clientSocket;
        System.out.println("connected to server");
        inFromUser = new BufferedReader(new InputStreamReader(System.in));
        clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("localhost");

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        String sentence = inFromUser.readLine();

        sendData = sentence.getBytes();
        
        DatagramPacket sendPacket =
            new DatagramPacket(sendData, sendData.length, IPAddress, 1234); 

        clientSocket.send(sendPacket);

        DatagramPacket receivePacket =
            new DatagramPacket(receiveData, receiveData.length);

        clientSocket.receive(receivePacket);

        String modifiedSentence =
            new String(receivePacket.getData());

        System.out.println("Rubleen Kaur -07613203118");

        clientSocket.close();
    }
}
