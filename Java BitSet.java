import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        BitSet bs1 = new BitSet(n);
        BitSet bs2 = new BitSet(n);
        scan.nextLine(); // Consume newline left after nextInt()

        for (int i = 0; i < m; i++) {
            String[] opr = scan.nextLine().split(" "); // Split input by space
            
            // Check the operation type and perform the corresponding action
            switch (opr[0]) {
                case "AND":
                    if (opr[1].equals("1")) {
                        bs1.and(bs2);
                    } else {
                        bs2.and(bs1);
                    }
                    break;
                case "OR":
                    if (opr[1].equals("1")) {
                        bs1.or(bs2);
                    } else {
                        bs2.or(bs1);
                    }
                    break;
                case "XOR":
                    if (opr[1].equals("1")) {
                        bs1.xor(bs2);
                    } else {
                        bs2.xor(bs1);
                    }
                    break;
                case "FLIP":
                    int idx = Integer.parseInt(opr[2]);
                    if (opr[1].equals("1")) {
                        bs1.flip(idx);
                    } else {
                        bs2.flip(idx);
                    }
                    break;
                case "SET":
                    int index = Integer.parseInt(opr[2]);
                    if (opr[1].equals("1")) {
                        bs1.set(index);
                    } else {
                        bs2.set(index);
                    }
                    break;
                default:
                    break;
            }
            
            System.out.println(bs1.cardinality() + " " + bs2.cardinality());
        }

        scan.close();
    }
}
