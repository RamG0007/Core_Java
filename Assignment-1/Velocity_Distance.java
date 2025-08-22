import java.util.*;
import java.util.Scanner;

public class Velocity_Distance
{
	public static void main(String[] args)
		{
			float u,a,t;     //u= initial velocity,   a=acceleration,  t=time
			double v,s;       //v=velocity,  s=distance

			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Initial Velocity (u)");
			u=sc.nextFloat();

			System.out.println("Enter the acceleration (a)");
			a=sc.nextFloat();

			System.out.println("Enter the time (t)");
			t=sc.nextFloat();

			v= u + (a * t);
			s = u * t + 0.5 * a * t * t;

			System.out.println("Velocity: "+v);
			System.out.println("Distance: "+s);
		}
}