package simulation;
import java.util.Scanner;
import java.util.Random;
public class Mainmethod {
	
	//creates random data for each car based on the numbers below 
	
	static String[] car_type = {"buick", "hybrid", "sedan"};
	private Random randi = new Random();
	public String getRand(){
        return car_type[randi.nextInt(car_type.length)];
    }
	//creates types of cars
	
	
	static int[] topspeed = {70, 100, 200, 250};
	private Random rand = new Random();
	public int getRandArrayElement(){
        return topspeed[rand.nextInt(topspeed.length)];
    }
	
	
	
	static int[] fuel_tank_amount = {300, 200, 250, 350};
	private Random randk = new Random();
	public int random(){
        return fuel_tank_amount[randk.nextInt(fuel_tank_amount.length)];
    }
	
	
	
	int mpg_amount = miles_until_empty / fuel_tank_amount;
	
	static int[] miles_until_empty = {100, 50, 75, 125};
	private Random randki = new Random();
	public int randomi(){
        return miles_until_empty[randki.nextInt(miles_until_empty.length)];
    }
	
	//Creates data on the track
	public static int[] track_distance = {100, 90, 80, 70, 60, 50};
	private Random randkil = new Random();
	public int randomio(){
        return track_distance[randkil.nextInt(track_distance.length)];
    }
	
	
	public static String[] track_type = {"desert", "forest", "urban", "oceanside"};
	private Random randkili = new Random();
	public String randomion(){
        return track_type[randkili.nextInt(track_type.length)];
    }
	
	
	//creates track type variables like what type of track it is and the distance for one turn.
	//Creates data on the race itself like amount of turns, time limit and the winner
	
	
	public static int[] track_laps = {5, 4, 3, 2, 1};
	private Random randkilo = new Random();
	public int randomiol(){
        return track_laps[randkilo.nextInt(track_laps.length)];
    }
	
	
	static int time_limit = 250;
	static int winner = 1;
	static int t = (track_distance * track_laps);
	
	//gets track with it's distance and turn amount with time limit. Also states overall distance
	
	
	
	public static void main(String[] args) {
		//Prints out items about the track, car, and and the race
		System.out.println("Hello, welcome to the race! Here is some data about the race with your car!");
		System.out.println("");
		System.out.println("This is the data on the track:");
		System.out.println("This is the type of track you are using: " + track_type);
		
		System.out.println(java.util.Arrays.toString(topspeed));
		
		System.out.println("This is how many turns the track has: " + track_laps);
		
		System.out.println("This is the distance of every lap in the track: " + track_distance);
		System.out.println("Your car must go this many miles overall: " + t);
		System.out.println("-----------------------");
		System.out.println("This is the data on the car");
		System.out.println("This is the car you are using: " + car_type);
		
		System.out.println("This is the mpg of your car: "+  mpg_amount);
		
		System.out.println("This is the fuel tank amount you start with: " + fuel_tank_amount);
		
		System.out.println("This is the top speed your car get get to :" + topspeed);
		
		System.out.println("This is the ammount of miles you can go before your tank is empty: "+ miles_until_empty);
		System.out.println("-----------------------");
		System.out.println("This is the data on the race itself:");
		System.out.println("You have this amount of seconds before the race ends: "+ time_limit);
		
		System.out.println("There can be this many winners: " + winner);
		System.out.println("------------------------------");
		
		//States how you are going to win, if you can
		
		
		System.out.println("This is the ammount of hours it is going to take to finish the race: " + t / topspeed);
		System.out.println("This is the rate of loss of this car: " + miles_until_empty / topspeed);
		System.out.println("This is how fast it is going to take to empty the car: " + topspeed / miles_until_empty);
		if(mpg_amount < topspeed * t)
		{
			System.out.println("You have to stop and get gas");
			//adds time to time limit
			
		}
	//Add more than one car here. Maybe up to 7 more cars. then it will calculate who is going to win and what order
	}
}
