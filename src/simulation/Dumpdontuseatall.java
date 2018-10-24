package simulation;

import java.util.Random;

public class Dumpdontuseatall {
	//This is code that I am saving just in case it is needed
	static Track distance = new Track();
	static Track turns = new Track();
	static Track type = new Track();
	
	
	private static final int desert = 0;
	private static final int forest = 0;
	private static final int urban = 0;
	private static final int ocean = 0;
	
	private static final int buick = 0;
	private static final int hybrid = 0;
	private static final int sedan = 0;
	
	
	
	static int t = (track_distance * track_laps);
	
	int mpg_amount = miles_until_empty / fuel_tank_amount;
	
	System.out.println("Your car must go this many miles overall: " + t);
	
	System.out.println("This is the mpg of your car: "+  mpg_amount);
	
	
	
	System.out.println("This is the ammount of hours it is going to take to finish the race: " + t / topspeed);
	System.out.println("This is the rate of loss of this car: " + miles_until_empty / topspeed);
	System.out.println("This is how fast it is going to take to empty the car: " + topspeed / miles_until_empty);
	if(mpg_amount < topspeed * t)
	
    }

