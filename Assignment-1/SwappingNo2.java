import java.util.*;
import java.util.Scanner;

public class SwappingNo2
{

	public static void main(String[] args)
	{
		int a,b;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Value Of a: ");
		a=sc.nextInt();

		System.out.println("Enter the Value Of b: ");
		b=sc.nextInt();

		System.out.println("Before Swapping: ");
		System.out.println("A: "+a+ "\nB: "+b);

		a=a*b;
		b=a/b;
		a=a/b;

		System.out.println("After Swapping: ");
		System.out.println("A: "+a+ "\nB: "+b);
	}
}