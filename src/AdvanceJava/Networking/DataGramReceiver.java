package AdvanceJava.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DataGramReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(33000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
        ds.close();
    }
}
