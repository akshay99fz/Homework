//Program to find the grade based on marks obtained.
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double avg=(double)(a+b+c)/3;
		if(avg>=90&&avg<=100)
		{
			System.out.println("A");
		}
		else if(avg>=80&&avg<=89)
		{
			System.out.println("B");
		}
		else if(avg>=70&&avg<=79)
		{
			System.out.println("C");
		}
		else if(avg>=60&&avg<=69)
		{
			System.out.println("D");
		}
		else if(avg>=0&&avg<=59)
		{
			System.out.println("F");
		}
	}

}
