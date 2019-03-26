package problem4;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Ask the user 10 multiplication questions. Check their answers and
		//give them their score
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);
		int score=0;

		int counter=1;
		while (counter<=10){
			
			int x1=rnd.nextInt(10-1+1)+1;
			int x2=rnd.nextInt(10-1+1)+1;
		
			System.out.println("What is "+x1+"*"+x2);
			double yes=in.nextDouble();
			if (yes==(x1*x2)) {
				System.out.println("Correct");
			int score2 =score+1;
			 score=score2;

			System.out.println("You currently have "+score2+" questions correct");
			}
			else {
				System.out.println("Wrong");
			}
			counter++;
		}
		System.out.println("Complete! You have a score of "+ score);
		in.close(); 
	}

}
