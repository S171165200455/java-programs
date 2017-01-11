public class PrimeNumber
{
	public int num,flag=0;
	public PrimeNumber(int x)
	{
	num=x;
	}
	int i;
	int temp=num;
		for(i=2;i<=temp/2;i++)
		{
		if(num%i==0)
		flag=flag + 1;
		else
		flag=0;
		}

		if(flag>0)
		{
			System.out.println("the number is not a prime number" +num);
			
		}
		else
		{
		System.out.println("the number is  a prime number" +num);
                
		}
		



public static void main(String[] args)
{
PrimeNumber p=new PrimeNumber(14);
}
}





