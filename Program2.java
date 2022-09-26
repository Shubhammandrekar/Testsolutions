import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		int j=1;
		for(int i=1;i<=a;i++)
		{
			System.out.print(j+" ");
			j+=2;
		}

	}

}
