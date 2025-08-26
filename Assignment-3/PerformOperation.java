import java.util.*;
import java.util.Scanner;

public class PerformOperation
{
	public static void main(String[] args)
	{
		int x,y,n;
		

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value of X: ");
		x=sc.nextInt();

		System.out.println("Enter the Value of Y: ");
		y=sc.nextInt();

		while(true){
			System.out.println("""
				1.Equality
				2.Less Than
				3.Quotient and Remainder
				4.Range
				5.Swap
				6.Exit
				Enter a Choice : 
			""");
			
			
		n=sc.nextInt();

		switch(n){
			
			case 1 ->{
					if((x==y)){
						System.out.println("x is equal to y");
						}
					else{
						System.out.println("x is not equal to y");
						}
				}

			case 2 ->{
					if(x<y)
						System.out.println(" x is less than y ");
					else
						System.out.println(" y is less than x ");
				}

			case 3 ->{
					int quotient=x/y;
					int rem=x%y;

					System.out.println("Quotient: "+quotient);
					System.out.println("Remainder: "+rem);	
				}

			case 4 ->{
					System.out.println("Enter the Number: ");
					int num=sc.nextInt();

					if(x < num && num < y){
						System.out.println(+num+ " is between "+x+ " and " +y);
					}
					else{
						System.out.println(+num+ " is not between "+x+ " and " +y);
					}
				}

			case 5 ->{
					x=x*y;
					y=x/y;
					x=x/y;

					System.out.println("After Swapping: ");

					System.out.println("X: "+x);
					System.out.println("Y: "+y);
						
				}
	
			case 6 ->{
					System.exit(0);
				}
			
			}
					
		}
	}

}
	