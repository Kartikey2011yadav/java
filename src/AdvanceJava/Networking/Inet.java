package AdvanceJava.Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Inet {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet = InetAddress.getByName("8.8.8.8");
        System.out.println(inet.getHostAddress());
        System.out.println(inet.getCanonicalHostName());
        System.out.println(inet.getHostName());
        String s = "Heloooretyreghutygheruytuhuehgtuyehgr uykhgt ueyrtuyhyerguytr ";
        System.out.println(Arrays.toString(s.getBytes()));
    }
}
