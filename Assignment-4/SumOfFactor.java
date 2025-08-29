import java.util.*;
import java.util.Scanner;

public class SumOfFactor
{
	public static void main(String[] args)
	{
		int n,sum=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++)
			
			if(n%i==0){
				sum+=i;
			}
		System.out.println("Sum Of Factors Given Number: "+sum);
	}
}