import java.util.Scanner;  
public class sumofdig
{  
	public static void main(String args[])  
	{  
		int number, digit, sum = 0;  
		Scanner s = new Scanner(System.in);  
		System.out.println("Enter a number: ");  
		number = s.nextInt();  
		
		while(number > 0)  
		{  
			digit = number % 10;  
			sum = sum + digit;  
			number = number / 10;  
		}  
	
	 System.out.println("Sum of Digits: "+sum);  
	}  
}  
