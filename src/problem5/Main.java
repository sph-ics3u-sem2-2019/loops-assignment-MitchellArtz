package problem5;
import java.util.Scanner;
public class Main {

	
		// Read the string and output in reverse case.
	static class Toggle
	{ 
	    public static void main()
	    { 
	    	Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	    
	       
	        String t = "";
	        for (int x = 0; x < str.length(); x++)
	        {  
	            char c = str.charAt(x);
	            boolean check = Character.isUpperCase(c);
	            if (check == true)
	                t = t + Character.toLowerCase(c);
	            else
	                t = t + Character.toUpperCase(c);
	        }
	        System.out.println (t);
	    }
	}}