// Program to count the number of positive, negative and zeroes in a set.
import java.util.Scanner;
public class Ques1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the set");
		int n=sc.nextInt();
		int arr[]= new int[n];
		int i, positivecount=0, negativecount=0, zerocount=0;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]==0)
			{
				zerocount++;
			}
			if(arr[i]>0)
			{
				positivecount++;
			}
			if(arr[i]<0) 
			{
				negativecount++;
			}
		}
		System.out.println("Positive Numbers: "+ positivecount);
		System.out.println("Negative Numbers: "+ negativecount);
		System.out.println("Zeroes: "+ zerocount);
	}

}
