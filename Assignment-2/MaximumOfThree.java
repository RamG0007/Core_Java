import java.util.*;
import java.util.Scanner;

public class MaximumOfThree
{
	public static void main(String[] args)
	{
		int a,b,c;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value of a: ");
		a=sc.nextInt();

		System.out.println("Enter the value of b: ");
		b=sc.nextInt();

		System.out.println("Enter the Value of C: ");
		c=sc.nextInt();

		if(a>b && a>c)
			System.out.println("a is greater than b and c");

		else if(b>a && b>c)
			System.out.println("b is greater than a and c");

		else
			System.out.println("c is greater than a and b");
	}
}
