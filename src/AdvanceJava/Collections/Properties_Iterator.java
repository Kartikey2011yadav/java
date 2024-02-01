package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Properties_Iterator {
    public static void main(String[] args) {
        Properties student = new Properties();
        student.put("Kartikey","Android Dev");
        student.put("Zakie","Python");
        student.put("Soham","notepad");
        student.put("Arindham",97.85);
        student.put("Akansha","UI/UX");
        student.put("Namaskruti","Data Sci");
        student.put("Samarth","React");
        student.put("Tanishq","Youtube Kids");

        Iterator itr = student.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry rec = (Map.Entry) itr.next();
            System.out.println(rec.getKey()+" => "+rec.getValue());
        }
    }
}
