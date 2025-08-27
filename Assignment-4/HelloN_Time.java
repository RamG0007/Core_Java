import java.util.*;
import java.util.Scanner;

public class HelloN_Time
{
	public static void main(String[] args)
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N: ");
		n=sc.nextInt();

		for(int i=0;i<n;i++)

			System.out.println("Hello");
	}
}