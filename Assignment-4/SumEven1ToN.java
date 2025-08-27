import java.util.*;
import java.util.Scanner;

public class SumEven1ToN
{
	public static void main(String[] args)
	{
		int n,sum=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the N: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("Sum Of Even 1 to " +n+ " Numbers: "+sum);
		
	}
}