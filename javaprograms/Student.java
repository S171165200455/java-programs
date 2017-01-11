import java.lang.*;
class Student
{
public int stid,avg;
public string stdname,grade;
public int m1,m2,m3,m4,m5;

public void student(int stid,string stdname)
{
this.stid=stid;
this.stdname=stdname;
System.out.println("stid=" +stid +"stdname=" +stdname);
}
public void average(int m1,int m2,int m3,int m4,int m5)
{
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.m4=m4;
this.m5=m5;
avg=(this.m1+this.m2+this.m3+this.m4+this.m5)/5;
System.out.println("avg=" +avg);
if((avg>=80) && (avg<=100))
System.out.println("A grade");
else if((avg>=60) && (avg<=79))
System.out.println("B grade");
else if((avg>=40) && (avg<=59))
System.out.println("C grade");
else
System.out.println("F grade");
}
}
public static void main(String args[])
{
Student s=new Student(101,nanthini);
s.average(80,90,70,90,100);

}




