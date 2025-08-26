import java.util.*;
import java.util.Scanner;

public class WeekDay
{
	public static void main(String[] args)
	{
		int ch;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number: ");
		ch=sc.nextInt();

		switch(ch){

			case 1 -> System.out.println("Monday");

			case 2 -> System.out.println("Thuesday");

			case 3 -> System.out.println("Wednesday");

			case 4 -> System.out.println("Thursday");

			case 5 -> System.out.println("Friday");

			case 6 -> System.out.println("Saturday");

			case 7 -> System.out.println("Sunday");

			default -> System.out.println("Invalid Choice");
		}
	}
}