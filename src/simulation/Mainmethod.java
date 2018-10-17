package simulation;
import java.util.Scanner;
public class Mainmethod {
	private static final int desert = 0;
	private static final int forest = 0;
	private static final int urban = 0;
	private static final int ocean = 0;
	//creates track type variables
	
	private static final int buick = 0;
	private static final int hybrid = 0;
	private static final int sedan = 0;
	//creates types of cars
	
	//creates random data for each car based on the numbers below
	static int[] car_type = {buick, hybrid, sedan};
	static int[] topspeed = {70, 100, 200};
	static int[] fuel_tank_amount = {100, 200, 150, 50};
	static int[] mpg_amount = {10, 20, 30, 50};
	static int[] miles_until_empty = {100, 50, 75, 125};
	
	
	
	public static int[] track_distance = {100, 90, 80, 70, 60, 50};
	public static int[] track_turns = {5, 4, 3, 2, 1};
	public static int[] track_type = {desert, forest, urban, ocean};
	static int[] time_limit = {300};
	static int[] winner = {1};
	//gets track with it's distance and turn amount with time limit
	
	
	
	public static void main(String[] args) {
		//Prints out items about the track, car, and and the race
		System.out.println("Hello, welcome to the race! Here is some data about the race with your car! ");
		
		System.out.println("this is the type of track you are using: " + track_type);
		
		System.out.println("this is how many turns the track has: " + track_turns);
		
		System.out.println("this is the distance of every lap in the track: " + track_distance);
		
		System.out.println("this is the car you are using: " + car_type);
		
		System.out.println("This is the mpg of your car: "+ mpg_amount);
		
		System.out.println("This is the fuel tank ammount you start with: " + fuel_tank_amount);
		
		System.out.println("this is the top speed your car get get to :" + topspeed);
		
		System.out.println("This is the ammount of miles you can go before your tank is empty: "+ miles_until_empty);
		
		System.out.println("you have this ammount of seconds before the race ends: "+ time_limit);
		
		System.out.println("there can be this many winners: " + winner);
	
	}
}
