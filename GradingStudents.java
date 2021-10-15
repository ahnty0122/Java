import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> r_grade = new ArrayList<>(grades);
        for(int i = 0; i < grades.size(); i++)
        {
            if(5 * ((int)(grades.get(i) / 5) + 1) - grades.get(i) < 3){
                r_grade.set(i, 5 * ((int)(grades.get(i) / 5) + 1));
            }
            else if(5 * ((int)(grades.get(i) / 5) + 1) - grades.get(i) >= 3){
                continue;
            }
            if(grades.get(i) < 38) r_grade.set(i, grades.get(i));
        }
        return r_grade;
    }   

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
