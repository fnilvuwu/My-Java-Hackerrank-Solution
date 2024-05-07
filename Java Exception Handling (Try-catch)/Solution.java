import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner obj = new Scanner(System.in);
        try {
            int x = obj.nextInt();
            int y = obj.nextInt();
            System.out.println(x/y);

        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println(e.getClass().getName());
        }


    }
}