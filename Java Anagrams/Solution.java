import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        // Assuming ASCII characters (128 characters)
        int[] charCount = new int[128];
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (char c : a.toCharArray()) {
            charCount[c]++;
        }
    
        for (char c : b.toCharArray()) {
            charCount[c]--;
            if (charCount[c] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}