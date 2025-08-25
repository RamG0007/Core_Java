import java.util.*;
import java.util.Scanner;

public class Cashier
{

	public static void main(String[] args)
	{
		int amount,ten,five,one;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Amount: ");
		amount=sc.nextInt();

		ten=amount/10;
		int rem=amount%10;

		five=rem/5;
		one=rem%5;

		
		System.out.println("10 Rupee: "+ten);
		System.out.println("5 Rupee: "+five);
		System.out.println("1 Rupee: "+one);
	}
}