package AdvanceJava.Networking;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try{
            Socket s =new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(
                    s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
