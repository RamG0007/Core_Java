import java.util.*;
import java.util.Scanner;

public class AreaOfCircumference
{

	public static void main(String[] args)

	{
	
	float r;
	double area, circumference;

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the Radius");
	r=sc.nextFloat();

	circumference = 2 * Math.PI * r;
        area = Math.PI * r * r;

	System.out.println("Area Of Circle: "+area);
	System.out.println("Area Of Circumference: "+circumference);

	}
}
	
	
	
	