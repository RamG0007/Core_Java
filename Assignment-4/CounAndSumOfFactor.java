import java.util.*;
import java.util.Scanner;

public class CounAndSumOfFactor
{
	public static void main(String[] args)
	{
		int n,sum=0,cnt=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++)
			
			if(n%i==0){
				cnt++;
				sum+=i;
			}
		System.out.println("Count Of Factors Given Number: "+cnt);
		System.out.println("Sum Of Factors Given Number: "+sum);
	}
}