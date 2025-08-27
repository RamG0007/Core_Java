import java.util.*;
import java.util.Scanner;

public class SumEven1To10
{
	public static void main(String[] args)
	{
		int sum=0;

		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("Sum Of Even 1 to 10 Numbers: "+sum);
		
	}
}