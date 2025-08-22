import java.util.*;
import java.util.Scanner;

public class SurfaceArea_Volume
{

	public static void main(String[] args)

	{
		float r,h;
		double s_area,volume;

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the Radius");
		r=sc.nextFloat();
		
		System.out.println("Enter the Height");
		h=sc.nextFloat();

		s_area = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
		volume = Math.PI * r * r * h;

		System.out.println("Surface Area Of Cylinder: "+s_area); 
		System.out.println("Volume Of Cylinder: "+volume);

	}

}
