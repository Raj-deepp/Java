import javax.sound.midi.Soundbank;

public class testt {
    public static void main(String[] args) {
        // char xyz[ ] = {'a', 'b', 'c', 'd', 'e', 'f'};
        // String s = new String(xyz,2,3);
        // System.out.println(s);

        // String s="Welcome to demo program";
        // int len=s.length();
        // char ch=s.charAt(4);
        // String res=s.substring(5, 10);
        // System.out.println(res);

        // String s1="sourajit"; 
        // String s2="sourajit"; 
        // String s3="SOURajit"; 
        // String s4="behera"; 
        // String s5="behera"; 
        // System.out.println(s2.compareTo(s5));//true because contents are same 

        // String fruit = "banana";
        // int index = fruit.indexOf('a', 2);
        // int ldx = fruit.lastIndexOf('a',4);
        // String s = "Hello".replace('l','w');
        // System.out.println(s);

    //     String myStr = "place planet earth, you are a great place to live in.";
    // System.out.println(myStr.indexOf("e", 5));
    // System.out.println(myStr.lastIndexOf("place"));
    // System.out.println(myStr.replace('l', 'p'));
    // System.out.println(myStr.length());
    // System.out.println("Index of substring 'is' from index:" + myStr.indexOf("place", 5));
    // String[] result = myStr.split(" ");
    // for (String str : result)
    // {
    //     System.out.println(str + ", ");
    // }
    //     System.out.println(myStr.toUpperCase());
    //     System.out.println(myStr.toLowerCase());

    // int data=30;
    // String str=String.valueOf(data);
    // System.out.println(str+40);

    // StringBuffer sb=new StringBuffer(50);
    // int x =sb.length();
    // int y=sb.capacity();
    // System.out.println(y);

    StringBuffer sb=new StringBuffer("Hello ");
    // sb.insert(4,"ok");
    System.out.println(sb);
    // sb.reverse();
    sb.replace(3,4,"va");
    System.out.println(sb);
    }
}
