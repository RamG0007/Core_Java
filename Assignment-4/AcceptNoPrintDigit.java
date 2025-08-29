import java.util.*;
import java.util.Scanner;

public class AcceptNoPrintDigit
{
	public static void main(String[] args)
	{
		int num,rem=0,sum=0;

		Scanner sc=new Scanner(System.in); 

		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		
		while(num != 0){
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}

		while(sum>0){
	
			rem=sum%10;
			System.out.println(rem);
			sum=sum/10;
		}
	}
}