import java.util.*;
import java.util.Scanner;

public class DivisibleFiveSeven1
{
	public static void main(String[] args)
	{
		int num;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		num=sc.nextInt();

		if(num%5==0  && num%7==0)
		{
			System.out.println("Number is Divisible 5 and 7");
		}

		else if(num%5==0)
		{
			System.out.println("Number is Divisible Only 5");
		}
	
		else if(num%7==0)
		{
			System.out.println("Number is Divisible Only 7");
		}
	
		else
		{
			System.out.println("Number is not Divisible 5 and 7");
		}
	}
}
