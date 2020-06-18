package z;

import java.io.IOException;
import java.net.*;

public class 网编 {
    public static void main(String[] args) throws IOException {
        String a="what you are  doning";
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket(a.getBytes(),a.getBytes().length, InetAddress.getByName("127.0.1.2"),666);
        socket.send(packet);
        socket.close();
    }
}
