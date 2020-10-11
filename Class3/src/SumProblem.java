//Program to perform operation based on user requirement
import java.util.Scanner;
public class SumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c;
		do
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
			System.out.println("Do you want to perform the operation again?(Press 1 to continue and 0 to terminate)");
			System.out.println();
			c=sc.nextInt();
		}
		while(c==1);
	}

}
