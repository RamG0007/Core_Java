import java.util.*;
import java.util.Scanner;

public class OddXtoYInclusive
{
	public static void main(String[] args)
	{
		int x,y,sum=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the X: ");
		x=sc.nextInt();

		System.out.println("Enter the Y: ");
		y=sc.nextInt();

		for(int i=x;i<=y;i++)
		{
			
			if(i%2==1)
				System.out.println(i);
		}
		
	}
}