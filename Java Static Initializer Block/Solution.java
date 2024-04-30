import java.util.Scanner;

public class Solution {
    private int breadth;
    private int height;

    {
        Scanner scan = new Scanner(System.in);
        breadth = scan.nextInt();
        height = scan.nextInt();
        scan.close();
        
        if (breadth <= 0 || height <= 0) {
            try {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println(breadth * height);
        }
    }

    public static void main(String[] args) {
        new Solution();
    }
}
