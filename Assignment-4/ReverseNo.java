import java.util.*;
import java.util.Scanner;

public class ReverseNo
{
	public static void main(String[] args)
	{
		int n,rev=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number: ");
		n=sc.nextInt();
	
		int rem=0;

		while(n>0){
		
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
}