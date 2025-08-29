import java.util.*;
import java.util.Scanner;

public class SumOfDigitGivenNumber
{
	public static void main(String[] args)
	{
		int num,rem=0,sum=0;

		Scanner sc=new Scanner(System.in); 

		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		
		while(num > 0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum Of Digit Given Numbers: "+sum);

	}
}