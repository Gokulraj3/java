import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a after swapping is "+a);
		System.out.println("The value of b after swapping is "+b);
	}
}
