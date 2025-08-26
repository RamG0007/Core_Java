import java.util.*;
import java.util.Scanner;

public class operation
{
	public static void main(String[] args)
	{
		int a;
		int b;
		char ch;

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the Value a: ");
		a=sc.nextInt();

		System.out.println("Enter the Value b: ");
		b=sc.nextInt();

		System.out.println("Enter the operation");
		ch=sc.next().charAt(0);

		switch(ch)
		{
			case '+' -> System.out.println(a+ " + " +b +" = "+(a+b));
			case '-' -> System.out.println(a+ " - " +b +"= "+(a-b));
			case '*' -> System.out.println(a+ " * " +b +"= "+(a*b));
			case '/' -> System.out.println(a+ " / " +b +"= "+(a/b));
			case '%' -> System.out.println(a+ " % " +b +"= "+(a%b));
			default -> System.out.println("Invalid Choice");		
		}
	}
}