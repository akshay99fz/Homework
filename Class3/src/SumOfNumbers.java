//Program to find the sum of n natural numbers
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
			{
			sum=sum+n;
			n--;
			}
		System.out.println(sum);
	}
}
