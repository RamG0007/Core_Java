import java.util.*;
import java.util.Scanner;

public class TimeValidNot
{
	public static void main(String[] args)
	{
		int hrs,sec,min;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Hour");
		hrs=sc.nextInt();

		System.out.println("Enter the Minute");
		min=sc.nextInt();

		System.out.println("Enter the Second");
		sec=sc.nextInt();

		if((0<=hrs)&&(hrs<24) && (0<=min)&&(min<60) && (0<=sec)&&(sec<60))
			System.out.println("Time is Valid");

		else
			System.out.println("Time is Not Valid");
	}
}