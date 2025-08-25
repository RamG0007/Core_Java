import java.util.*;
import java.util.Scanner;

public class PrintPaintedArea
{
	public static void main(String[] args)
	{
		float l,b,h,ld,bd,lw,bw;
		float areaOfRoom,areaDoor,areaWindow,paintArea;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Length ");
		l=sc.nextFloat();

		System.out.println("Enter the breadth");
		b=sc.nextFloat();

		System.out.println("Enter the height");
		h=sc.nextFloat();

		System.out.println("Enter the length door");
		ld=sc.nextFloat();

		System.out.println("Enter the breadth door");
		bd=sc.nextFloat();

		System.out.println("Enter the length window");
		lw=sc.nextFloat();

		System.out.println("Enter the breadth window");
		bw=sc.nextFloat();

		areaOfRoom=2 * h * (l + b);

		areaDoor=ld * bd;
		areaWindow= 2 * (lw * bw);

		paintArea= areaOfRoom - (areaDoor + areaWindow);
	
		float areaRoof=l * b;

		System.out.println("Print the area to be painted: "+paintArea);
		System.out.println("area to be whitewashed: "+areaRoof);

	}
} 

		
		
		
