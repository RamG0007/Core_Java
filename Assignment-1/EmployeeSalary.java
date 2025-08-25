import java.util.*;
import java.util.Scanner;

public class EmployeeSalary
{
	public static void main(String[] args)
	{
		int id;
		String name;
		float bSalary;
		float da=10;        //10%
		float hra=30;       //30%
		float tax=5;        //5%
		double totalSalary;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Emp Id: ");
		id=sc.nextInt();

		System.out.println("Enter the Emp Name: ");
		name=sc.next();

		System.out.println("Enter the Basic Salary: ");
		bSalary=sc.nextFloat();

		totalSalary=bSalary + ((bSalary * (da + hra - tax)) / 100);

		System.out.println("***** Employee Details *****");

		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Total Salary: "+totalSalary);

	}
}
		
	