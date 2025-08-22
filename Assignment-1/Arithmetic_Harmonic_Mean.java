import java.util.*;
import java.util.Scanner;

public class Arithmetic_Harmonic_Mean
{
	public static void main(String[] args)
		{
			float a,b,AM,HM;

			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Two Numbers");
			a=sc.nextFloat();
			b=sc.nextFloat();

			
			AM=(a+b) / 2;
			HM=a * b/(a+b);

			System.out.println("Arithmetic Mean: "+AM);
			System.out.println("Harmonic Mean: "+HM);
		}

}
			