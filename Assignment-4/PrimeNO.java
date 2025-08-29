import java.util.*;
import java.util.Scanner;

public class PrimeNO
{
	public static void main(String[] args)
	{
		int n,flag=1;

		Scanner sc=new Scanner (System.in);

		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		if(n<=1){
			flag=0;
		}
	
		else if(n==2 || n==3){
			flag=1;
		}
 		
		else if(n%2==0 || n%3==0){
			flag=0;
		}

		else
		{
			for(int i=5;i<=Math.sqrt(n);i+=6)
			{
				if(n%i==0 || n % (i+2)==0)
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not prime");
		}
	}
}
