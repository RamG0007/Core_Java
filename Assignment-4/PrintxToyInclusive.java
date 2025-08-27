import java.util.*;
import java.util.Scanner;

public class PrintxToyInclusive
{
	public static void main(String[] args)
	{
		int x,y;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The X: ");
		x=sc.nextInt();

		System.out.println("Enter The Y: ");
		y=sc.nextInt();

		for(int i=x;i<=y;i++)
			System.out.println(i);
	}
}