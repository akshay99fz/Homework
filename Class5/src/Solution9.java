import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
//Program Staircase
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution9 {

    // Complete the staircase function below.
    static void staircase(int n) {
        int i,j;
        if(n<=100)
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n-i;j++)
                {
                System.out.print(" ");
                }
                for(j=n;j>(n-i);j--)
                {
                System.out.print("#");            
                }
                System.out.println();
            }
            
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
