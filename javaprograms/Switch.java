import java.lang.*;
public class Switch
{
public static void main(String args[])
{
char grade='a';
switch(grade)
{
case 'a':
System.out.println("Excellent");
break;
case 'b':
System.out.println("well done");
break;
case 'c':
System.out.println("you passed");
break;
case 'd':
System.out.println("better try again");
break;
default :
System.out.println("Invalid grade");
}
System.out.println("your grade is" +grade);
}
}
