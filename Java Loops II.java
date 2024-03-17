import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum_query = a;
            for (int j = 0; j < n; j++) {
                sum_query += Math.pow(2, j) * b;
                System.out.print(sum_query + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
