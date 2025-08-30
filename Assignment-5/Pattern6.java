import java.util.*;
import java.util.Scanner;

public class Pattern6
{
	public static void main(String[] args)
	{
		int n;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the N: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print(j);
			}
					System.out.println(" ");
		}
	}
}
