//(with || operator)

import java.util.*;
import java.util.Scanner;

public class DivisibleFiveSeven2
{
	public static void main(String[] args)
	{
		int num;

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the Number: ");
		num=sc.nextInt();

		if(num%5==0 || num%7==0)
			System.out.println("Number is Divisible by 5 or 7");

		else
			System.out.println("Number is Not Divisible By 5 or 7");
	}
}