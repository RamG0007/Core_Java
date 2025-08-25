import java.util.*;
import java.util.Scanner;

public class CompareTwoNo
{
	public static void main(String[] args)
	{
		int a,b;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value a: ");
		a=sc.nextInt();
	
		System.out.println("Enter the value b: ");
		b=sc.nextInt();

		if(a == b)
		{
			System.out.println("a and b is Equal");
		}

		else if(a > b)
		{
			System.out.println("a is greater than b");
		}

		else if(a < b)
		{
			System.out.println("a is less than b");
		}
	}
}

