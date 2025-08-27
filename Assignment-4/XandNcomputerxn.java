import java.io.*;
import java.util.*;

public class XandNcomputerxn
{
	public static void main(String[] args)
	{
		int x,n;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the X: ");
		x=sc.nextInt();

		System.out.println("Enter the N: ");
		n=sc.nextInt();
		
		double power = Math.pow(x,n);

		System.out.println("x and n computer x^n: "+power);
	}
}
		