import java.util.Scanner;
public class revnum   
{  
	public static void main(String[] args)   
	{  
		int remainder,reverse = 0;  
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		while(n!= 0)   
		{  
			remainder = n % 10;  
			reverse = reverse * 10 + remainder;  
			n = n/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}  
}