import java.util.*;
import java.util.Scanner;

public class ArmstrongNo
{
	public static void main(String[] args)
	{
		int n,rem=0,sum=0,cnt=0;
		double res=0;

		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter the Number: ");
		n=sc.nextInt();

		int temp=n;

		while(n>0){
			
			cnt++;
			n=n/10;
		}

		n=temp;

		while(n>0){
		
			rem=n%10;
			res=res+(Math.pow(rem,cnt));

			n=n/10;
		}

		if(res==temp)
			System.out.println("Number is Armstrong");

		else
			System.out.println("Number is Not Armstrong");
	}
}		
		
		

		

	