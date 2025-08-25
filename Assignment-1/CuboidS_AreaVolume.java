import java.util.*;
import java.util.Scanner;

public class CuboidS_AreaVolume
{

	public static void main(String[] args)
	{
		float l,b,h;      //l=length ,b=breadth ,h=height
		double sArea,volume;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Length Of Cuboid");
		l=sc.nextFloat();

		System.out.println("Enter the breadth Of Cuboid");
		b=sc.nextFloat();

		System.out.println("Enter the height Of Cuboid");
		h=sc.nextFloat();

		sArea= 2 * (l*b + l*h + b*h);
		volume= l * b * h;

		System.out.println("Surface Area Of Cuboid: " +sArea);
		System.out.println("Volume Of Cuboid: " +volume);
	}
}