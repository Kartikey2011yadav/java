package Collections.Theatre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassRecords {
    public static void main(String[] args) {
        List<id> stud = new ArrayList<>();
        stud.add(new id("tamnishq",63));
        stud.add(new id("Nathkhat",58));
        stud.add(new id("guttka",32));
        stud.add(new id("jakie",31));
        stud.add(new id("Npc",25));
        stud.add(new id("R2D2",69));
        stud.add(new id("Joe",49));
        stud.add(new id("swifty",6));

        Iterator<id> itr = stud.iterator();
        while (itr.hasNext())
        {
            id rec = itr.next();
            System.out.println("Name: "+rec.getName()+" Roll No: "+rec.getRollNo());
        }
        List<id> ls = new ArrayList<>();
        ls.add(new id("tamnishq",63));
        ls.add(new id("Nathkhat",58));
        ls.add(new id("guttka",32));
        ls.add(new id("jakie",31));
        ls.add(new id("Npc",25));
        ls.add(new id("R2D2",69));
        ls.add(new id("Joe",49));
        ls.add(new id("swifty",6));
        System.out.println(stud.equals(ls));
        System.out.println(ls);


    }
}
