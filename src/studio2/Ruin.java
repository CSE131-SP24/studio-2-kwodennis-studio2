package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money did you start with? ");
		int startAmount = in.nextInt();
		System.out.println("What is your win chance? ");
		double winChance = in.nextDouble();
		System.out.println("winLimit? ");
		int winLimit = in.nextInt(); 
		int timesPlayed = 0;
		System.out.println("totalSimulations? ");
		int totalSimulations = in.nextInt();
		int currentAmount = 0;
		
		for (int i = 0; i < totalSimulations; i++)
				{
				while ((currentAmount > 0) && (currentAmount < winLimit))
		{
			if (winChance > Math.random()) 
			{
				currentAmount++; 
				timesPlayed++;
				
			}
			else 
			{
				currentAmount--;
				timesPlayed++;
			}
		}
		
		if (currentAmount == 0)
		{
			System.out.println("Simulation: "+ i + " " + timesPlayed + " LOSE" );	
			currentAmount = startAmount;
		}
		
		if (currentAmount == winLimit)
		{
			System.out.println("Simulation: " + i + " " + timesPlayed + " WIN" );	
			currentAmount = startAmount; 

		}
				}	
		
		

                   }
}

