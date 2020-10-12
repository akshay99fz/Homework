// Program Birthday Cake Candles
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles, Collections.reverseOrder());
        int i, max=0,count=0;
        for(i=0;i<candles.size();i++)
        {
            if(candles.get(i)>max)
            {
                max=candles.get(i);
            }
        }
        for(i=0;i<candles.size();i++)
        {
            if(candles.get(i)==max)
            {
                count++;
            }
        }
        return count;
    }

}

public class Solution2 {
    public static void main(String[] args)throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        System.out.println(result);
        System.out.println();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
