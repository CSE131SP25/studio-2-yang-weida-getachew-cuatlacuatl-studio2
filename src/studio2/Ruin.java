package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		//Variables
		System.out.println("Starting Amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win Limit: ");
		double winLimit = in.nextDouble();
		System.out.println("Days: ");
		int totalSimulations = in.nextInt();
		
		
		//double winning = Math.random()*100;
		//System.out.println(winning);
		
		int i = 0;
		
		while (i!=totalSimulations) {
		
			double money = startAmount; 
			
			while (money>0 && money<winLimit) {
				double winning = Math.random()*100;
				boolean win = winning<winChance;
				if(win) {
					System.out.println("win");
					money+=1;
				} else {
					System.out.println("lose");
					money-=1;
				}
			}
			
				if (money == 0) {
					System.out.println("The day was a ruin");
					i +=1;
				} else {
					System.out.println("It was a successful day.");
					i+=1;
				}
		}
	}

}
