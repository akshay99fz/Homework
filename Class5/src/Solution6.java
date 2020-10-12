// Program Plus Minus
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution6 {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int i;
        int a=0,b=0,c=0;
        int len=arr.length;
        float one=0f,two=0f,three=0f;
        for(i=0;i<len;i++)
        {   
             if(arr[i]==0)
            {
                c++;
            }
            else if(arr[i]>0)
            {
                a++;
            }
            else
            {
                b++;
            }
        }
        one=(float)a/len;
        two=(float)b/len;
        three=(float)c/len;
        System.out.printf("%.6f \n",one);
        System.out.printf("%.6f \n",two);
        System.out.printf("%.6f \n",three);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
