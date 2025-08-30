import java.util.*;
import java.util.Scanner;

public class ArmstrongNo
{
	public static void main(String[] args)
	{
		int n;
		

		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		for(int i=0;i<=n;i++){
			int num=i;
			int rem=0,sum=0,cnt=0;
			double res=0;
			
			int temp=num;

			while(temp>0){
			
				cnt++;
				temp=temp/10;
			}

			num=i;

			while(num>0){
		
				rem=num%10;
				res=res+(Math.pow(rem,cnt));

				num=num/10;
			}
		

			if(res==i){
				System.out.println(i);
			}
		}			

	}
}		
		
		

		

	