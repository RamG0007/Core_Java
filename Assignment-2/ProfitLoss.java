import java.util.*;
import java.util.Scanner;

public class ProfitLoss
{
	public static void main(String[] args)
	{
		float costPrice,sellingPrice;
		float profit,loss;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the costPrice");
		costPrice=sc.nextFloat();

		System.out.println("Enter the sellingPrice");
		sellingPrice=sc.nextFloat();

		if(costPrice < sellingPrice)
			{
				profit = sellingPrice - costPrice;
				System.out.println("Profit: "+profit);
			}
		else
			{
				loss = costPrice - sellingPrice;
				System.out.println("Loss: "+loss);
			}
	}
}