import java.util.*;
import java.util.Scanner;

public class EmpSalaryTax
{
	public static void main(String[] args)
	{
		float salary;
		double tax=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Annual Basic Salary: ");
		salary=sc.nextFloat();

		if(salary<150000)
			tax=0;

		else if(salary > 150000 && salary <=300000)
			tax=(salary-150000)*0.20;

		else if(salary > 300000)
			tax=(150000*0.20)+(salary-300000)*0.30;

		System.out.println("Income Tax: "+tax);
	}
}