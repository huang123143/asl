package o;

public class l {
    public static void main(String[] args) {
        String c = "456789";
        boolean v = c.matches("[0-9]+");
        System.out.println(v);
        String z="\\d";
        System.out.println("5".matches(z));
        String p="\\D";
        System.out.println("p".matches(p));
        String m="\\w";
        System.out.println("l".matches(m));
    }
}
