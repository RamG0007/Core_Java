import java.util.*;
import java.util.Scanner;

public class VowelConsonant
{
	public static void main(String[] args)
	{
		char ch;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Character: ");
		ch=sc.next().charAt(0);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("Character is Vowel ");

		else
			System.out.println("Character is consonant");
	}
}
