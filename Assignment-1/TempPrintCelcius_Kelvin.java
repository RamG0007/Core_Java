import java.util.*;
import java.util.Scanner;

public class TempPrintCelcius_Kelvin
{
	public static void main(String[] args)
		{
			float f;     //f=Fahrenheit
			double celsius,kelvin;     

			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the Fahrenheit");
			f=sc.nextFloat();

			celsius=(5.0 / 9.0) * (f-32);
			kelvin = celsius + 273.15;

			System.out.println("Celsius:" +celsius);
			System.out.println("Kelvin: " +kelvin);
		}

}
			