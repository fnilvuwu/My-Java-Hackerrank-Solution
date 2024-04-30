//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{   
        HashMap<String, Integer> phone_book = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phone_book.put(name, phone);
            
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if (phone_book.containsKey(s)) {
 
                // Mapping
                Integer a = phone_book.get(s);
    
                // Printing value for the corresponding key
                System.out.println(s + "=" + a);
            }
            else {
                System.out.println("Not found");
            }
		}
	}
}