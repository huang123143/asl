import java.util.ArrayList;
import java.util.Collection;

public class jihe {
    public static void main(String[] args) {

        Collection    c = new ArrayList<>();
        c.add("asd");
        c.add("kop");

        Collection c1=new ArrayList<>();
        c1.add("l");
        c1.add("asd");
        c.addAll(c1);
        System .out.println(c);

        boolean b1=c.retainAll(c1);

        System.out.println(c);
    }
}
