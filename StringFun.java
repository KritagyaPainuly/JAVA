import java.*;
class StringFun{
public static void main(String arr[])
{
String n1="Hello World";
String n2="HEllo World";
System.out.println(n1+" "+n2);
String n3=n1.toLowerCase();
String n4=n2.toUpperCase();
System.out.println(n3+" "+n4);
System.out.println(n1.length()+" LENGTH");
System.out.println(n1.substring(4,7)+" "+n2.substring(5));
System.out.println(n1.indexOf('l')+" "+n2.indexOf('S'));
System.out.println(n1.charAt(4)+" "+n2.charAt(1));
System.out.println(n1.equals(n2));
}
}
