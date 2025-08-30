import java.util.*;
import java.util.Scanner;

public class Pattern2
{
	public static void main(String[] args)
	{
		int n;

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the N: ");
		n=sc.nextInt();

		for(int i=n;i>=1;i--){
			for(int j=n;j>=i;j--){
				System.out.print(j);
			}
		System.out.println(" ");
		}
	}
}
