// Given number is prime or non prime(yes or no)
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a positive number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2,flag=0;
		while(i<=Math.sqrt(n))
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			i++;
		}
		if(flag==1)
		{
			System.out.println("No");
		}
		else
			System.out.println("Yes");
	}
}
