package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
		System.out.println("1st number");
		int value=in.nextInt();	
		System.out.println("2nd number");
		int value2=in.nextInt();	
		
		in.close(); 
	
		int sum = 0;
		for (int i = value; i <= value2; i++)
		{
		    sum += i;
		}
		System.out.println(sum);
		}
	

}
