// Program to find largest and smallest number in a given set
import java.util.Scanner;
public class Ques2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the set");
		int n=sc.nextInt();
		int arr[]= new int[n];
		int i, small=Integer.MAX_VALUE, large=Integer.MIN_VALUE;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>large)
			{
				large=arr[i];
			}
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println("Largest Numbers: "+ large);
		System.out.println("Smallest Numbers: "+ small);
	}

}
