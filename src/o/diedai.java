package o;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class diedai {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(12);
        c.add(45);
        c.add(23);
        Iterator it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
