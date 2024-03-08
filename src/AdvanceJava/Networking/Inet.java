package AdvanceJava.Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Inet {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress intet = InetAddress.getByName("8.8.8.8");
        System.out.println(intet.getHostAddress());
        System.out.println(intet.getCanonicalHostName());
        System.out.println(intet.getHostName());
        String s = "Heloooretyreghutygheruytuhuehgtuyehgr uykhgt ueyrtuyhyerguytr ";
        System.out.println(Arrays.toString(s.getBytes()));
    }
}
