import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        BigInteger a = object.nextBigInteger();
        BigInteger b = object.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}