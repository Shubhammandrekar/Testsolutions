import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9};
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
		int len=scan.nextInt();
		int arr1[]=new int[len];
		int arr2[]=new int[arr.length];
		System.out.println("enter the array element");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=arr1.length-1;j++)
			{
				if(arr1[j]%arr[i]==0)
				{
					count++;
					arr2[i]=count;
				}
			}
		}
      for(int i=0;i<=arr2.length-1;i++)
      {
    	  System.out.print(arr[i]+":"+arr2[i]+" ");
      }
	}

}
