import java.util.*;
import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		int n;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=10;j++)
			{
				
				System.out.println(+i+ "*" +j+ "=" +i*j);
			}
		System.out.println("\t");
		}
	}
}