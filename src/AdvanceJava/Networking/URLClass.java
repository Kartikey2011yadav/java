package AdvanceJava.Networking;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class URLClass {
    public static void main(String[] args) {
        try{
//            URL url = new URL("http://niggin.com");
            URL url = new URL("https://mangapill.com/chapters/5343-10139000/mokushiroku-no-yonkishi-chapter-139");
//            URL url = new URL("https://libgen.li/index.php?req=ian+sommerville&columns%5B%5D=t&columns%5B%5D=a&columns%5B%5D=s&columns%5B%5D=y&columns%5B%5D=p&columns%5B%5D=i&objects%5B%5D=f&objects%5B%5D=e&objects%5B%5D=s&objects%5B%5D=a&objects%5B%5D=p&objects%5B%5D=w&topics%5B%5D=l&topics%5B%5D=c&topics%5B%5D=f&topics%5B%5D=a&topics%5B%5D=m&topics%5B%5D=r&topics%5B%5D=s&res=25&filesuns=all");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getFile());
            System.out.println(url.getPath());
            System.out.println(url.getDefaultPort());
            System.out.println(url.openConnection());
            System.out.println("-----------------------------------------------------------------------------------");

            URLConnection u = url.openConnection();
            System.out.println(u.getInputStream());
            System.out.println(u.getHeaderField(3));
            InputStream i = u.getInputStream();

            int temp = i.read();
            while (temp != -1){
//                System.out.print((char) temp);
                temp = i.read();
            }

            System.out.println("-----------------------------------------------------------------------------------");
            InetAddress intet = InetAddress.getByName("8.8.8.8");
            System.out.println(intet.getHostAddress());
            System.out.println(intet.getCanonicalHostName());
            System.out.println(intet.getHostName());
            String s = "Heloooretyreghutygheruytuhuehgtuyehgr uykhgt ueyrtuyhyerguytr ";
            System.out.println(Arrays.toString(s.getBytes()));


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
