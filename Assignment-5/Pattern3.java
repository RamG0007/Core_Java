import java.util.*;
import java.util.Scanner;

public class Pattern3
{
	public static void main(String[] args)
	{
		int n;

		Scanner sc=new Scanner (System.in);

		System.out.println("Enter the N: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==n || j==n || i==1 || j==1){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}
		System.out.println(" ");
		}
	}
}
