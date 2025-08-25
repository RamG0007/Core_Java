import java.util.*;
import java.util.Scanner;

public class XYCoordinate
{
	public static void main(String[] args)
	{
		float x1,y1,x2,y2;
		double distance;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the X1-Coordinate: ");
		x1=sc.nextFloat(); 

		System.out.println("enter the Y1-Coordinate: ");
		y1=sc.nextFloat();

		System.out.println("enter the X2-Coordinate: ");
		x2=sc.nextFloat();

		System.out.println("enter the Y2-Coordinate: ");
		y2=sc.nextFloat();

		distance= Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));

		System.out.println("Distance: "+distance);
	}
}