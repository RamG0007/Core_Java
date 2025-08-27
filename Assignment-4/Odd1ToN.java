import java.util.*;
import java.util.Scanner;

public class Odd1ToN
{
	public static void main(String[] args)
	{
		int n;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the N: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++)
			
			if(i%2==1)
				System.out.println(i);
	}
}