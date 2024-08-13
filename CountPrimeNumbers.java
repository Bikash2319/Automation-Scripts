import java.util.Scanner;
class CountPrimeNumbers
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a range :");
		int a =scan.nextInt();
		int count=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			count++;
		}
		if(count==1)
		{
		System.out.println(a+"is prime");
		}
		else
		{
		System.out.println(a+"is not prime");
		}
	}
}