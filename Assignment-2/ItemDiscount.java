import java.util.*;
import java.util.Scanner;

public class ItemDiscount
{
	public static void main(String[] args)
	{	
		String item1,item2,item3;
		int quantity1,quantity2,quantity3;
		float rate1,rate2,rate3;
		double total,discount=0,finalRate;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Item1 Name: ");
		item1=sc.next();

		System.out.println("Enter the Quantity of item1: ");
		quantity1=sc.nextInt();

		System.out.println("Enter the Rate Of Item1: ");
		rate1=sc.nextFloat();

		System.out.println("Enter the Item2 Name: ");
		item2=sc.next();

		System.out.println("Enter the Quantity of item2: ");
		quantity2=sc.nextInt();

		System.out.println("Enter the Rate Of Item2: ");
		rate2=sc.nextFloat();


		System.out.println("Enter the Item3 Name: ");
		item3=sc.next();

		System.out.println("Enter the Quantity of item3: ");
		quantity3=sc.nextInt();

		System.out.println("Enter the Rate Of Item3: ");
		rate3=sc.nextFloat();

		total=(quantity1 * rate1) + (quantity2 * rate2) + (quantity3 * rate3);

		if(total >= 10000)
			discount=total * 0.20;

		else if(total >= 5000 && total < 10000)
			discount=total * 0.15;

		else if(total >=2000 && total < 5000)
			discount=total * 0.08;

		finalRate=total-discount;

		System.out.println("Total Amount: "+total);
		System.out.println("Discount: "+discount);
		System.out.println("Final Amount: "+finalRate);
	}
}

		 

		
		



		