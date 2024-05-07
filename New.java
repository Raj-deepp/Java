public class New
{ 
public static void main(String args[])
{ 
String s1="sourajit"; 
String s2="sourajit"; 
String s3="SOURajit"; 
String s4="behera"; 
String s5="behera"; 
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s4));
System.out.println(s2.equalsIgnoreCase(s3));
System.out.println(s2.compareTo(s5));
}
}
