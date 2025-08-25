import java.util.*;
import java.util.Scanner;

public class BetweenCheck
{
	public static void main(String[] args)
	{
		int a,b,c;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Value a: ");
		a=sc.nextInt();

		System.out.println("Enter the value b: ");
		b=sc.nextInt();

		System.out.println("Enter the value c: ");
		c=sc.nextInt();

		if(a > b && a < c || a < b && a > c)
			System.out.println(+a+ "is between" +b+ "and" +c);

		else
			System.out.println(+a+ "is not between" +b+ "and" +c);
	}
}