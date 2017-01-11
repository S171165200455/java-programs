import java.lang.*;
public class Area
{
private int l;
private int b;
private int a;
private void area(int x,int y)
{
a=x;
b=y;
 a=l*b;
System.out.println("area=" +a);
}
public static void main(String args[])
{
Area obj=new Area();
obj.area(2,10);
System.out.println("hello");
System.out.println("l=" +obj.l);
System.out.println("b=" +obj.b);
}
}


