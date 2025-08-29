import java.util.*;
import java.util.Scanner;

public class AcceptNoPrintCountDigit
{
	public static void main(String[] args)
	{
		int num,cnt=0;

		Scanner sc=new Scanner(System.in); 

		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		if(num==0){
			cnt=1;
		}

		while(num>0){
			num=num/10;
			cnt++;
		}
		System.out.println("Number Digit Count is: "+cnt);
	}
}
		