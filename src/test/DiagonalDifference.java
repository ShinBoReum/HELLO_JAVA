package test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     *
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference
*
* ex1)
4
-1  1  -7  -8
-10  -8  -5  -2
0   9   7  -1
4   4  -2   1
* ex2)
3
11 2 4
4 5 6
10 8 -12
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int left =0;
        int right = 0;

        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(0).size());
        int size = arr.size();
        for(int i=0; i<arr.size(); i++){
            /*
            00
            11
            22
            33
            44
            */
            left += arr.get(i).get(i);
            System.out.println("left" +arr.get(i).get(i));
            /*
            03;
            12;
            21;
            30;
            */
            right += arr.get(i).get(size-1);
            System.out.println("right" +arr.get(i).get(size-1));
            size--;
        }

        System.out.println("finalLeft: "+left);
        System.out.println("finalRight: "+right);



        int sum = Math.abs(left-right);

        return sum;
    }

}
public class DiagonalDifference {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);
        System.out.println("result: "+result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
