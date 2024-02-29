import java.util.Scanner;
public class primenum 
{
  public static void main(String[] args) 
  {
	int count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		count++;
	}
	if(count==2)
	System.out.print("Its a prime number");
	else
	System.out.print("It's not a prime number");
	
	}	
	
  }