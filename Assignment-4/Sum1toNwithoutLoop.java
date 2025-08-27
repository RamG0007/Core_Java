import java.util.*;
import java.util.Scanner;

public class Sum1toNwithoutLoop
{
	public static void main(String[] args)
	{
		int n,sum=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the N: ");
		n=sc.nextInt();

		sum=n*(n+1)/2;
		
		System.out.println("Sum of 1 to N numbers: "+sum);
	}
}