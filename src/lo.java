public class lo {
    public static void main(String[] args) {
        //转成字节数组
     /*String s="abc";
        byte[] arr=s.getBytes();
     for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
     }*/

     /* String a="heima";//转成字符数组
      char[]arr=a.toCharArray();
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }*/
       /* char[] a = {'a', 'b', 'c'};//字符数组转换成字符串
        String arry = String.valueOf(a);

        System.out.println(arry);*/

    String s="ASDJ";//字符串转成小写
    String s1=s.toLowerCase();
    System.out.println(s1);
    String c="[a-z && [^bc]]";
    System.out.println("s".matches(c));
    System.out.println("b".matches(c));

    }
}
