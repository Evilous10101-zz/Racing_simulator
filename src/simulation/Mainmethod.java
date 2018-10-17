package simulation;
import java.util.Scanner;
public class Mainmethod {
	
	//creates track type variables
	
	
	//creates types of cars
	
	//creates random data for each car based on the numbers below
	static String[] car_type = {"buick", "hybrid", "sedan"};
	static int[] topspeed = {70, 100, 200, 250};
	static int[] fuel_tank_amount = {100, 200, 150, 50};
	static int[] mpg_amount = {10, 20, 30, 50};
	static int[] miles_until_empty = {100, 50, 75, 125};
	//Creates data on the track
	public static int[] track_distance = {100, 90, 80, 70, 60, 50};
	public static String[] track_type = {"desert", "forest", "urban", "ocean"};
	//Creates data on the race itself
	public static int[] track_turns = {5, 4, 3, 2, 1};
	static int[] time_limit = {250};
	static int[] winner = {1};
	//gets track with it's distance and turn amount with time limit
	
	
	
	public static void main(String[] args) {
		//Prints out items about the track, car, and and the race
		System.out.println("Hello, welcome to the race! Here is some data about the race with your car!");
		System.out.println("");
		System.out.println("This is the data on the track:");
		System.out.println("This is the type of track you are using: " + track_type);
		
		System.out.println(java.util.Arrays.toString(topspeed));
		
		System.out.println("This is how many turns the track has: " + track_turns);
		
		System.out.println("This is the distance of every lap in the track: " + track_distance);
		System.out.println("-----------------");
		System.out.println("This is the data on the car");
		System.out.println("This is the car you are using: " + car_type);
		
		System.out.println("This is the mpg of your car: "+ mpg_amount);
		
		System.out.println("This is the fuel tank ammount you start with: " + fuel_tank_amount);
		
		System.out.println("This is the top speed your car get get to :" + topspeed);
		
		System.out.println("This is the ammount of miles you can go before your tank is empty: "+ miles_until_empty);
		System.out.println("-----------------------");
		System.out.println("This is the data on the race itself:");
		System.out.println("You have this amount of seconds before the race ends: "+ time_limit);
		
		System.out.println("There can be this many winners: " + winner);
		System.out.println("------------------------------");
		//States how you are going to win, if you can
		int t = (track_distance * track_turns);
		System.out.println("This is the ammount of miles overall you have to go though: " + t);
		System.out.println("This is the ammount of hours it is going to take to finish the race: " + t / topspeed);
		System.out.println("This is the rate of loss of this car: " + mpg_amount / topspeed);
		System.out.println("This is the amount of time it will take to finish the race");
		if(mpg_amount + topspeed > fuel_tank_amount)
		{
			System.out.println("You have to stop and get gas");
			//adds time to time limit
			
		}
	
	}
}
