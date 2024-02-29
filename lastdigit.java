import java.util.Scanner;
public class lastdigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		long lastdigit;
		int n=s.nextInt();
		lastdigit=n%10;
		System.out.println("The last digit of the given number is "+lastdigit);
	}
}
