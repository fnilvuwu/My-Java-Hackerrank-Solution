import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat us_f = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in_f = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat cn_f = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr_f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = us_f.format(payment);
        String india = in_f.format(payment);
        String china = cn_f.format(payment);
        String france = fr_f.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
