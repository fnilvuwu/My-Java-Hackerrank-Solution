import java.io.*;
import java.util.*;

class Solution<T> {
    T obj;
    
    Solution(T obj) {
        this.obj = obj;
    }
    
    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        
        Solution<Integer> intSolution = new Solution<>(1);
        Solution<String> stringSolution = new Solution<>("Hello");
        
        intSolution.printArray(intArray);
        
        stringSolution.printArray(stringArray);
    }
}
