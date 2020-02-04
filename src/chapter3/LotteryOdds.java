package chapter3;
import java.util.Scanner;
public class LotteryOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.print("What is the highest number you can draw?");
		int n = in.nextInt();
		
		int lotteryOdds = 1;
		for(int i=1;i<=k;i++)
			lotteryOdds = lotteryOdds*(n-i+1)/i;
		System.out.println("Your odds are 1 in "+lotteryOdds+". Gook luch!");
		in.close();
	}

}
