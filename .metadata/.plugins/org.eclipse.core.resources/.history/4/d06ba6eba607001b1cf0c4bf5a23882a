//Program to print whether a year is leap year or not.
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int flag;
		if((a%4)==0)
		{
			if((a%100)==0)
			{
				if((a%400)==0)
				{
					flag=0;
				}
				else
					flag=1;
			}
			else 
				flag=0;
		}
		else 
			flag=1;
		if(flag==0)
		{
			System.out.println("Leap Year");
		}
		else
			System.out.println("Not a Leap Year");
	}

}
