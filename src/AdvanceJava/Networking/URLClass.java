package AdvanceJava.Networking;

import java.net.URL;

public class URLClass {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://mangapill.com/chapters/5343-10139000/mokushiroku-no-yonkishi-chapter-139");

            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getFile());
            System.out.println(url.getPath());
            System.out.println(url.getDefaultPort());
            System.out.println(url.openConnection());


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
