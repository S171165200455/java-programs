import java.util.*;
public class MultipleCatch
{
public int a,b,result;
public static void main(String args[])
{
MultipleCatch obj=new MultipleCatch();
Scanner sc=new Scanner(System.in);
try
{
System.out.println("enter the a value");
obj.a=sc.nextInt();
System.out.println("enter the  b value");
obj.b=sc.nextInt();
obj.result=obj.a/obj.b;
System.out.println("result:" +obj.result);
}
catch(Exception e)
{
System.out.println("Denominator should not be zero:" +e);
}
System.out.println("After the code:" +obj.result);
}
}