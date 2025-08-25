import java.util.*;
import java.util.Scanner;

public class EvenOdd1
{
	public static void main(String[] args)
	{
		int num;

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number: ");
		num=sc.nextInt();

		String res=(num%2==0) ? "Even" : "Odd";
		
		System.out.println(num+" number is "+res);

	}
}