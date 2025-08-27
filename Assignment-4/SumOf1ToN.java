import java.util.*;
import java.util.Scanner;

public class SumOf1ToN
{
	public static void main(String[] args)
	{
		int n,sum=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the N: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++)

			sum+=i;
			System.out.println("Sum of 1 to N numbers: "+sum);
	}
}