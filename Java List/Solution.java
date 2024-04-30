import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            myList.add(scan.nextInt());
        }
        int l = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < l; i++) {
            String operation = scan.next();
            if (operation.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                myList.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = scan.nextInt();
                myList.remove(index);
            }
            if (scan.hasNextLine()) {
                scan.nextLine();
            }
        }
        
        for (Integer num : myList) {
            System.out.print(num + " ");
        }
    }
}
