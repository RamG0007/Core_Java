import java.util.*;
import java.util.Scanner;

public class Marks
{
	public static void main(String[] args)
	{
		int sub1,sub2,sub3,totalMark;
		float average;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Mark Subject 1: ");
		sub1=sc.nextInt();

		System.out.println("Enter the Mark Subject 2: ");
		sub2=sc.nextInt();

		System.out.println("Enter the Mark Subject 3: ");
		sub3=sc.nextInt();

		totalMark=sub1 + sub2 + sub3;
		average=totalMark/3;

		System.out.println("Total Mark: "+totalMark);
		System.out.println("Average: "+average);

		if(average >= 90)
			System.out.println("Pass Class I");

		else if(average < 90 && average >= 80)
			System.out.println("Pass Class II");

		else if(average < 80 && average >=70)
			System.out.println("Pass Class III");

		else if(average < 70 && average >=35)
			System.out.println("Pass ");

		else if(average < 35)
			System.out.println("Fail");

		else
			System.out.println("Out Of Range ");
	}
}
				