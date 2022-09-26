import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the value of a and b");
	double a=scan.nextInt();
	double b=scan.nextInt();
	double c;
	System.out.println("enter the operation to perform");
	String str=scan.next();
	if(str.equals("addition"))
	{
		c=a+b;
		System.out.println(c);
		
	}
	else if(str.equals("subtraction"))
	{
		c=a-b;
		System.out.println(c);
	}
	else if(str.equals("multiplication"))
	{
		c=a*b;
		System.out.println(c);
	}
	else if(str.equals("division"))
	{
		c=a/b;
		System.out.println(c);
	}
	else {
		System.out.println("Invalid operation input ");
	}
	}

}
