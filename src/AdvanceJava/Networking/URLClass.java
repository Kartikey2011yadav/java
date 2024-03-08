package AdvanceJava.Networking;

import java.net.URL;

public class URLClass {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://mangapill.com/chapters/2085-10243000/jujutsu-kaisen-chapter-243");

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
