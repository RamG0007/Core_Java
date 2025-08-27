import java.util.*;
import java.util.Scanner;

public class SumXtoYInclusive
{
	public static void main(String[] args)
	{
		int x,y,sum=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the X: ");
		x=sc.nextInt();

		System.out.println("Enter the Y: ");
		y=sc.nextInt();

		for(int i=x;i<=y;i++)
		{
			
			sum+=i;

			System.out.println(i);
		}
		System.out.println("Sum Of X and Y (both Inclusive) numbers: "+sum);
	}
}