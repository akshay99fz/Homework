//Program to find even odd sum
import java.util.Scanner;
public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the set");
		int n=sc.nextInt();
		int arr[]= new int[n];
		int i=0, oddsum=0,evensum=0;
		while(n>0)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}
			n--;i++;
		}
		System.out.println(evensum+" "+oddsum);
	}
}
