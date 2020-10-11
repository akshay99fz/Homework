//Triangle is valid or not
import java.util.Scanner;

public class ValidTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a+b+c)==180)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Not Valid");
		}
	}

}
