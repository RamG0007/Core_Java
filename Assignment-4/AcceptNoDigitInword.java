import java.util.*;
import java.util.Scanner;

public class AcceptNoDigitInword
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
			sum=sum/10;
		
		if(rem==0)
			System.out.println("Zero");
		else if(rem==1)
			System.out.println("One");
		else if(rem==2)
			System.out.println("Two");
		else if(rem==3)
			System.out.println("Three");
		else if(rem==4)
			System.out.println("Four");
		else if(rem==5)
			System.out.println("Five");
		else if(rem==6)
			System.out.println("Six");
		else if(rem==7)
			System.out.println("Seven");
		else if(rem==8)
			System.out.println("Eigth");
		else if(rem==9)
			System.out.println("Nine");
		}
	}
}