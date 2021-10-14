import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        List<Long> c = new ArrayList<>();
        long sum = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            sum += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++)
        {
            c.add(sum - arr.get(i));
        }
        long min = c.get(0);
        long max = c.get(0);
        for(int i = 0; i < arr.size(); i++)
        {
            if(min >= c.get(i)) min = c.get(i);
            if(max <= c.get(i)) max = c.get(i);
        }
        System.out.println(min + " " + max);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
