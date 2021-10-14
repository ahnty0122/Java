import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int count = arr.size();
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        
        for (int i = 0; i < count; i++) {
            if (arr.get(i) > 0) {
                positive ++;
            } else if (arr.get(i) < 0) {
                negative ++;
            } else {
                zeros ++;
            }
        }
 
        System.out.println(positive / (double) count);
        System.out.println(negative / (double) count);
        System.out.println(zeros / (double) count);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
