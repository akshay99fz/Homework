// Program to print Fibonacci Series
import java.util.Scanner;
public class Ques4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the series");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				arr[i]=0;
				System.out.println(arr[i]);
			}
			else if(i==1)
			{
				arr[i]=1;
				System.out.println(arr[i]);
			}
			else 
			{
				arr[i]=arr[i-2]+arr[i-1];
				System.out.println(arr[i]);
			}
		}
	}

}
