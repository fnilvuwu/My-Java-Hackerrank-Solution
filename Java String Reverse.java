import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        StringBuilder B = new StringBuilder(A);
        
        B.reverse();
        
        if (A.equals(B.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
