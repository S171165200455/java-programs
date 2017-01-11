import java.lang.*;
import java.util.Scanner;
public class PrimeMethod
{
public static void main(String[] args)
{
int num,i,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
num=sc.nextInt();
for(i=2;i<=num/2;i++)
{
if(num%i==0)
flag++;
}
if(flag>0)
{
System.out.println("The number is not a prime number" +num);
}
else
{
System.out.println("The number is a prime number" +num);
}
}
}
