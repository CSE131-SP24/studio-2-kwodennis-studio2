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
		
		for (int i = 0; i < totalSimulations; i++)
				{
				while ((startAmount > 0) && (startAmount < winLimit))
		{
			if (winChance > Math.random()) 
			{
				startAmount++; 
				timesPlayed++;
				
			}
			else 
			{
				startAmount--;
				timesPlayed++;
			}
		}
		
		if (startAmount == 0)
		{
			System.out.println("Simulation: "+ i + " " + timesPlayed + " LOSE" );	
			timesPlayed = startAmount;
		}
		
		if (startAmount == winLimit)
		{
			System.out.println("Simulation: " + i + " " + timesPlayed + " WIN" );	
			timesPlayed = startAmount; 

		}
				}	
		
		

                   }
}

