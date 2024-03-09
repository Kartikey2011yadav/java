package AdvanceJava.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

// server to client

public class Client {
    public static void main(String[] args)
    {
        try {

            Socket socket = new Socket("localhost", 1346);
            System.out.println("Connected Successfully.....");

            BufferedReader bs = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Response from Server.....");

            System.out.println("Client Side : " + bs.readLine());

            socket.close();
        }
        catch (UnknownHostException e) {

            System.out.println("IP not found for" + e);
        }
        catch (IOException e) {

            System.out.println("Not found data for socket" + e);
        }
    }
}
