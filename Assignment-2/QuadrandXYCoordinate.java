import java.util.*;
import java.util.Scanner;

public class QuadrandXYCoordinate
{
	public static void main(String[] args)
	{
		float x,y;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the X-Coordinate: ");
		x=sc.nextFloat();

		System.out.println("Enter the Y-Coordinate: ");
		y=sc.nextFloat();

		if(x==0 && y==0)
			System.out.println("The Point in Origin");
	
		else if(x>0 && y>0)
			System.out.println("Point Lies Quadrant in I");

		else if(x<0 && y>0)
			System.out.println("Point Lies Quadrant In II");

		else if(x<0 && y<0)
			System.out.println("Point Lies Quadrant In III");

		else if(x>0 && y<0)
			System.out.println("Point Lies Quadrant In IV");

		else if(x==0)
			System.out.println("The Point lies in Y-axis");

		else if(y==0)
			System.out.println("The Point lies in X-axis");
	}
}