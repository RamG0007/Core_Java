import java.util.*;
import java.util.Scanner;

public class AcceptNoPrintCountEvenOddZeroDigit
{
	public static void main(String[] args)
	{
		int num,rem,evenCnt=0,oddCnt=0,zeroCnt=0;

		Scanner sc=new Scanner(System.in); 

		System.out.println("Enter the Number: ");
		num=sc.nextInt();

		if(num==0){
			zeroCnt=1;
		}
		
		while(num>0)
		{
			int rev=num%10;

			if(rev==0)
				zeroCnt++;
			else if(rev%2==0)
				evenCnt++;
			else if(rev%2==1)
				oddCnt++;
		num=num/10;
		}
		System.out.println("The Number in Count of Even No is: "+evenCnt);
		System.out.println("The Number in Count of Odd No is: "+oddCnt);
		System.out.println("The Number in Count of Zero No is: "+zeroCnt);
	}
}