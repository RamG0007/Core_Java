import java.util.*;
import java.util.Scanner;

public class LibraryCharges
{
	public static void main(String[] args)
	{
		int lateDays;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the days the member is late: ");
		lateDays=sc.nextInt();

		if(lateDays <= 5)
			System.out.println("Fine is Rs.50");
		
		else if(lateDays > 5 && lateDays <= 10)
			System.out.println("Fine is Rs.100");

		else if(lateDays > 10)
			System.out.println("Fine is Rs.200");

	}
}
