import java.util.Scanner;

class Palindrom
{
	public static void main(String[] args)
	{
		int n, temp;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value n:");
		n = sc.nextInt();
		
		temp = n;
		
		while(n > 0)
		{
			int re = n % 10;
			sum = (sum * 10) + re;
			n = n / 10;
		}
		
		if(temp == sum)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}	
	}
}