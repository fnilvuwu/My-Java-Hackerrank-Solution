import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        List<Integer> sums = generateSubarraySums(array);
        
        int totalNeg = 0;
        for (int sum : sums) {
            if (sum < 0) {
                totalNeg++;
            }
        }
        
        System.out.println(totalNeg);
        scanner.close();
    }
    
    private static List<Integer> generateSubarraySums(int[] array) {
        List<Integer> sums = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += array[k];
                }
                sums.add(sum);
            }
        }

        return sums;
    }
}