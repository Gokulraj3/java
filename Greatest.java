import java.util.Scanner;
public class Greatest
  {
    public static void main(String[]args)
    {
      int a,b,c,greatest,temp;
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first number:");
      a = sc.nextint();
      System.out.println("Enter the second number:");
      b=sc.nextint();
      System.out.println("Enter the third number:");
      c=sc.nextint();
      temp=a>b?a:b;
      greatest=c>temp?c:temp:
      System.out.println("the greatest number is:"+greatest);
    }
  }
