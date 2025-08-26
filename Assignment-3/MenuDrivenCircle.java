import java.util.*;
import java.util.Scanner;

public class MenuDrivenCircle
{
	public static void main(String[] args)
	{
		float r;    //4/3*pi*r*r*r

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Radius: ");
		r=sc.nextFloat();

		while(true){
			System.out.println("""
				1.Area Of Circle
				2.Circumference of Circle
				3.Volume of Sphere
				4.Exit
				Enter Your Choice: 
				""");
			int ch=sc.nextInt();
			
			switch(ch){
			
				case 1 -> {	
						double a= Math.PI * r * r;
						System.out.println("Area Of Circle: "+a);
					}

				case 2 -> {
						double circum= 2 * Math.PI * r;
						System.out.println("Circumference of Circle: "+circum);
					}

				case 3 -> {
						double vSphere= (4.0 / 3.0) * Math.PI * r * r * r;
						System.out.println("Volume of Sphere: "+vSphere);
					}
				case 4 ->{
						System.exit(0);
					}
				}
		}
	}
	
}

