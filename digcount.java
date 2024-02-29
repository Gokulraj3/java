import java.util.Scanner;
public class digcount {
		public static void main(String[] args)   
		{  
			Scanner s =new Scanner(System.in);
			System.out.println("Enter a number:");
			int n=s.nextInt();
			int count=0;
			while(n>0)
			{
				n=n/10;
				count++;
			}
			System.out.println("The digit count is "+count);  
		}  
	}
