package AdvanceJava.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConntect {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://mangapill.com/chapters/5343-10139000/mokushiroku-no-yonkishi-chapter-139");
        URLConnection u = url.openConnection();
        System.out.println(u.getInputStream());
        System.out.println(u.getHeaderField(3));
        InputStream i = u.getInputStream();

        int temp = i.read();
        while (temp != -1){
                System.out.print((char) temp);
            temp = i.read();
        }
    }
}
