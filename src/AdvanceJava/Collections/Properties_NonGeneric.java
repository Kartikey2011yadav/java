package AdvanceJava.Collections;

import java.util.Properties;

public class Properties_NonGeneric {
    public static void main(String[] args) {

        Properties data = new Properties();
        data.setProperty("name", "Kartikey Yadav");
        data.setProperty("email", "Kartikey@gmail.com");
        data.setProperty("Roll No.", "IT-2k21-25");

        System.out.println(data);
    }
}
