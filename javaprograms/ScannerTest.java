import java.util.*;
class ScannerTest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your rollno");
int rollno=sc.nextInt();
System.out.println("enter your name");
String name=sc.next();
System.out.println("rollno:" +rollno+"name:" +name);
sc.close();
}
}