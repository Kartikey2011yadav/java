package AdvanceJava.Collections;

import java.util.Map;
import java.util.Properties;

public class Properties_ForEach {
    public static void main(String[] args) {
        Properties data = new Properties();
        data.put("Android Dev","Kartikey");
        data.put("ML","Zakie");
        data.put(58,"Soham");
        data.put(11,"Arindham");
        data.put("Designing","Akansha");
        data.put("Culprit","Namaskruti");
        data.put(56,"Samarth");

        for (Map.Entry rec:data.entrySet()) {
            System.out.println(rec.getKey()+" : "+rec.getValue());
        }
    }
}
