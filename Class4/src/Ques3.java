// Program for Armstrong Number between 1-500
public class Ques3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i,rem,a,k;
			for(i=2;i<=500;i++)
			{
				a=0;
				k=i;
				while(k>0)
				{
					rem=k%10;
					k=k/10;
					a+=rem*rem*rem;
				}
				if(a==i)
				{
					System.out.println(i + " ");
				}
			}
	}

}
