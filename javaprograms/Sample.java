public class Sample
{
private int a,b,c;
public void add(int x, int y)
{
a=x;
b=y;
c=a+b;
}
public void display()
{
System.out.println("the value of a"= +a);
System.out.println("the value of b"= +b);
System.out.println("c=" +c);
}
}
public static void main(String,args[])
{
Sample adt=new Sample();
adt.add(10,20);
adt.display();
}
