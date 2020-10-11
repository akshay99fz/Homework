//Program to find factorial
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		if(n==0)
		{
			fact=1;
		}
		else
		{
			while(n>0)
			{
				fact=fact*n;
				n--;
			}
		}
		System.out.println(fact);
	}

}
