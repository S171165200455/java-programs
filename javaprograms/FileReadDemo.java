import java.io.*;
class FileReadDemo
{
public static void main(String[] args)
{
try
{
FileInputStream fis=new FileInputStream("D:\\meena.txt");
int avl=fis.available();
System.out.println("No of bytes:" +avl);
byte buff[]=new byte[avl];
fis.read(buff,0,avl);
String str=new String(buff);
System.out.println("the content of file:" +str);
fis.close();
}
catch(Exception e)
{
System.out.println("exception arised");
}
}
}






