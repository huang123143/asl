public class zik {
    public static void main(String[] args) {
        String s1="abcloiad";
        String s2="hellow";
        String s6=new String ("I am  a nice  stu");
        String s3=s1.concat(s2);
        String s4=s2.substring(1,4);
        boolean b=s1.startsWith("a");
        boolean b1=s1.endsWith("w");
        int len=s1.length();
        System.out.println("s1的长度为"+len);
        System.out.println("s3的结合为"+s3);
        System.out.println("s1是否与s2相等"+s1.equals(s2));
        System.out.println("s2截取后为"+s4);
        System.out.println(  s1.compareTo("aba"));
        System.out.println("s1是否已a开头"+b);
        System.out.println("s1是否已w结尾"+b1);
        System.out.println("s1转换大写为"+s1.toUpperCase());
        System.out.println("第一个a出现在"+s6.indexOf("a"));
        System.out.println("第二个a出现在"+s6.lastIndexOf("a"));
        System.out.println(s6.replace("stu","student"));

    }
}
