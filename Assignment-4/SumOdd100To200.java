import java.util.*;
import java.util.Scanner;

public class SumOdd100To200
{
	public static void main(String[] args)
	{
		int sum=0;

		for(int i=100;i<=200;i++)
		{
			if(i%2==1)
				sum+=i;
		}
		System.out.println("Sum Of Odd 100 to 200 Numbers: "+sum);
		
	}
}