// Program to calculate the sum of series:1-1/2+1/3-1/4+...1/n
import java.util.Scanner;
public class Ques6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the series");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			a=(double)1/i;
			if(i%2==0)
			{
			sum=sum-a;
			}
			if((i%2)!=0)
			{
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}

}
