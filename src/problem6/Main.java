package problem6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        String str = read.nextLine();
      
        int i = str.length() - str.length();
 	char y = str.charAt(i);
        System.out.println(y);
 	System.out.println(str+ y);
	
	read.close();
	}}



