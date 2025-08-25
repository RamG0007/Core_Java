import java.util.*;
import java.util.Scanner;

public class PositiveNo
{
	public static void main(String[] args)
	{
		int num;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		num=sc.nextInt();

		if(num>=0)
			System.out.println("Positive Number");

	}
}
		