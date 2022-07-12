package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		//int  TODO Auto-generated method stub

	int num=24;
	boolean cond= false;
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
		{
			cond= true;
			break;
		}
	}
	if (!cond)
		System.out.println(num + "is a prime number");
	else
		System.out.println(num + "is not prime number");
	}
}
