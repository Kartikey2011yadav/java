package AdvanceJava.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

// server to client

public class Server {
    public static void main(String[] args) {
        try {

            ServerSocket serversocket = new ServerSocket(1346);

            Socket socket = serversocket.accept();

            System.out.println("Request Accepted...");

            PrintStream ps = new PrintStream(socket.getOutputStream());

            System.out.print("enter input: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Input the data at the server...");

            ps.print(br.readLine());
            socket.close();
            serversocket.close();
        } catch (IOException e) {

            System.out.println("Not found data for socket" + e);
        }
    }
}
