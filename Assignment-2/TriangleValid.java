import java.util.*;
import java.util.Scanner;

public class TriangleValid
{

	public static void main(String[] args)
	{
		float a,b,c;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Value a: ");
		a=sc.nextFloat();

		System.out.println("Enter the Value b: ");
		b=sc.nextFloat();

		System.out.println("Enter the Value c: ");
		c=sc.nextFloat();
		
		if((a+b>c) && (a+c>b) && (b+c>a))
			System.out.println("Triangle is Valid");

		else
			System.out.println("Triangle is Not Valid");
	}
}

 