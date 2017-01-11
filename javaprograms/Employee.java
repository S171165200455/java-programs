public class  Employee
{
public int emp id;
public string emp name;
public void setid(int empid)
{
this.empid=empid;
}
public void setname(strring empname)
{
this.empname=empname;
}
public void getid()
{
return empid;
}
public void getname()
{
return empname;
}

public void getdetails()
{
return "emp id:" +emp id + "emp name:" +emp name
}
}
public class Manager extends Employee
{
string deptname;
public void setdeptname(string deptname)
{
this.deptname=deptname;
}
public void getdeptname()
{
return deptname;
}


public void getdetails()
{
return super.void getdetails() + department name: +department name;
}
}
public static void main(string[] args)
{
Manager m=new Manager();
m.setid(101);
m.setname("harry");
m.setdeptname("finance");
System.out.println(m.getdetails());

Employee e=new Employee();
e.setid(102);
e.setname("marry");
System.out.println(e.getdetails());
}
