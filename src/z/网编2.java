package z;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class 网编2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        socket.receive(packet);
        byte[] data = packet.getData();
        int length = packet.getLength();
        System.out.println(new String (data,0,length));
        socket.close();

    }
}
